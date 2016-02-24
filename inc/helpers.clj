(defmacro with-but-collectd
  [keys & children]

  (let [new-keys (merge {:host nil
                         :type nil
                         :type_instance nil
                         :ds_type nil
                         :ds_name nil
                         :ds_index nil
                         :plugin nil
                         :plugin_instance nil}
                        keys)]
    `(~'with ~new-keys ~@children)))

(defn float-to-percent
  [& children]
  (fn [e]
    (when (and e (:metric e))
      (let [new-event (assoc e :metric (* 100 (:metric e)))]
        (call-rescue new-event children)))))


