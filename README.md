# webflux/netty perf test
## run:
./gradlew bootrun

## result of load test of 1000 concurrent request at time:

```
ab -n 100000 -c 1000 http://localhost:8080/
This is ApacheBench, Version 2.3 <$Revision: 1826891 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 10000 requests
Completed 20000 requests
Completed 30000 requests
Completed 40000 requests
Completed 50000 requests
Completed 60000 requests
Completed 70000 requests
Completed 80000 requests
Completed 90000 requests
Completed 100000 requests
Finished 100000 requests


Server Software:
Server Hostname:        localhost
Server Port:            8080

Document Path:          /
Document Length:        13 bytes

Concurrency Level:      1000
Time taken for tests:   5.983 seconds
Complete requests:      100000
Failed requests:        0
Total transferred:      11100000 bytes
HTML transferred:       1300000 bytes
Requests per second:    16714.36 [#/sec] (mean)
Time per request:       59.829 [ms] (mean)
Time per request:       0.060 [ms] (mean, across all concurrent requests)
Transfer rate:          1811.81 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0   45 205.2      1    1044
Processing:     0   11  25.0      8     447
Waiting:        0   10  24.9      7     446
Total:          0   56 216.2      9    1477

Percentage of the requests served within a certain time (ms)
  50%      9
  66%     12
  75%     14
  80%     15
  90%     19
  95%     39
  98%   1034
  99%   1053
 100%   1477 (longest request)
 ```