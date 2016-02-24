(def thresholds
  {"cpu-average/cpu-user" {:warning 30 :critical 60}
   "cpu-average/cpu-system" {:warning 30 :critical 60}
   "cpu-average/cpu-used" {:warning 60 :critical 90}
   "cpu-average/cpu-nice" {:warning 50 :critical 20}
   "cpu-average/cpu-idle" {:warning 50 :critical 20 :invert true}
   "cpu-average/cpu-steal" {:warning 50 :critical 20}

   "load/load/shortterm" {:warning 3 :critical 4}
   "load/load/midterm" {:warning 3 :critical 4}
   "load/load/longterm" {:warning 3 :critical 4}

   "processes/ps_state-blocked" {:warning 4 :critical 8}
   "processes/ps_state-paging" {:warning 4 :critical 8}
   "processes/ps_state-running" {:warning 16 :critical 24}
   "processes/ps_state-sleeping" {:warning 500 :critical 1000}
   "processes/ps_state-stopped" {:warning 1 :critical 8}
   "processes/ps_state-zombies" {:warning 0 :critical 8}

   "memory/memory-buffered" {}
   "memory/memory-cached" {}
   "memory/memory-free" {:warning 0.10
                         :critical 0.05
                         :invert true}
   "memory/memory-used" {}
   "memory/memory-slab_recl" {}
   "memory/memory-slab_unrecl" {}
   "memory/percent-used" {:warning 80
                          :critical 98}

   "swap/swap-cached" {}
   "swap/swap-free" {}
   "swap/swap-used" {}
   "swap/swap_io-in" {}
   "swap/swap_io-out" {}

   "uptime/uptime" {:warning 1 :critical 0 :invert true}

   "df-root/percent_bytes-free" {:warning 10 :critical 6 :invert true}

   "interface-wlan0/if_octets/rx" {:warning 768 :critical 1024}
   "interface-wlan0/if_octets/tx" {:warning 768 :critical 1024}
   "interface-eth0/if_octets/rx" {}
   "interface-eth0/if_octets/tx" {}

   "nginx/nginx_connections-active" {}
   "nginx/connections-accepted" {}
   "nginx/connections-handled" {}
   "nginx/nginx_requests" {}
   "nginx/nginx_connections-reading" {}
   "nginx/nginx_connections-writing" {}
   "nginx/nginx_connections-waiting" {}

   "tail-auth/counter-sshd-invalid_user" {:warning 0 :critical 10}
   "tail-auth/counter-sshd-successful-logins" {}

   "mysql-master/cache_result-qcache-hits" {}
   "mysql-master/cache_result-qcache-inserts" {}
   "mysql-master/cache_result-qcache-not_cached" {}
   "mysql-master/cache_result-qcache-prunes" {}
   "mysql-master/cache_size-qcache" {}
   "mysql-master/mysql_commands-admin_commands" {}
   "mysql-master/mysql_commands-change_db" {}
   "mysql-master/mysql_commands-commit" {}
   "mysql-master/mysql_commands-create_table" {}
   "mysql-master/mysql_commands-delete" {}
   "mysql-master/mysql_commands-drop_table" {}
   "mysql-master/mysql_commands-flush" {}
   "mysql-master/mysql_commands-insert" {}
   "mysql-master/mysql_commands-purge" {}
   "mysql-master/mysql_commands-select" {}
   "mysql-master/mysql_commands-set_option" {}
   "mysql-master/mysql_commands-show_databases" {}
   "mysql-master/mysql_commands-show_fields" {}
   "mysql-master/mysql_commands-show_master_status" {}
   "mysql-master/mysql_commands-show_status" {}
   "mysql-master/mysql_commands-show_tables" {}
   "mysql-master/mysql_commands-show_variables" {}
   "mysql-master/mysql_commands-unlock_tables" {}
   "mysql-master/mysql_commands-update" {}
   "mysql-master/mysql_handler-commit" {}
   "mysql-master/mysql_handler-delete" {}
   "mysql-master/mysql_handler-external_lock" {}
   "mysql-master/mysql_handler-prepare" {}
   "mysql-master/mysql_handler-read_first" {}
   "mysql-master/mysql_handler-read_key" {}
   "mysql-master/mysql_handler-read_next" {}
   "mysql-master/mysql_handler-read_rnd_next" {}
   "mysql-master/mysql_handler-update" {}
   "mysql-master/mysql_handler-write" {}
   "mysql-master/mysql_locks-immediate" {}
   "mysql-master/mysql_locks-waited" {}
   "mysql-master/mysql_log_position-master-bin" {}
   "mysql-master/mysql_octets/rx" {}
   "mysql-master/mysql_octets/tx" {}
   "mysql-master/mysql_select-full_join" {}
   "mysql-master/mysql_select-full_range_join" {}
   "mysql-master/mysql_select-range" {}
   "mysql-master/mysql_select-range_check" {}
   "mysql-master/mysql_select-scan" {}
   "mysql-master/mysql_sort-merge_passes" {}
   "mysql-master/mysql_sort-range" {}
   "mysql-master/mysql_sort-rows" {}
   "mysql-master/mysql_sort-scan" {}
   "mysql-master/threads-cached" {}
   "mysql-master/threads-connected" {}
   "mysql-master/threads-running" {}
   "mysql-master/total_threads-created" {}

   "memcached-example-cache-1/df-cache/free" {:warning 0.10
                                             :critical 0.05
                        		     :invert true}
   "memcached-example-cache-1/df-cache/used" {}
   "memcached-example-cache-1/memcached_command-config_get" {}
   "memcached-example-cache-1/memcached_command-config_set" {}
   "memcached-example-cache-1/memcached_command-flush" {}
   "memcached-example-cache-1/memcached_command-get" {}
   "memcached-example-cache-1/memcached_command-set" {}
   "memcached-example-cache-1/memcached_command-touch" {}
   "memcached-example-cache-1/memcached_connections-current" {}
   "memcached-example-cache-1/memcached_connections-listen_disabled" {}
   "memcached-example-cache-1/memcached_items-current" {}
   "memcached-example-cache-1/memcached_octets/rx" {}
   "memcached-example-cache-1/memcached_octets/tx" {}
   "memcached-example-cache-1/memcached_ops-decr_hits" {}
   "memcached-example-cache-1/memcached_ops-decr_misses" {}
   "memcached-example-cache-1/memcached_ops-evictions" {}
   "memcached-example-cache-1/memcached_ops-hits" {}
   "memcached-example-cache-1/memcached_ops-incr" {}
   "memcached-example-cache-1/memcached_ops-incr_hits" {}
   "memcached-example-cache-1/memcached_ops-incr_misses" {}
   "memcached-example-cache-1/memcached_ops-misses" {}
   "memcached-example-cache-1/percent-hitratio" {}
   "memcached-example-cache-1/percent-incr_hitratio" {}
   "memcached-example-cache-1/ps_count/processes" {}
   "memcached-example-cache-1/ps_count/threads" {}
   "memcached-example-cache-1/ps_cputime/syst" {}
   "memcached-example-cache-1/ps_cputime/user" {}

   })
