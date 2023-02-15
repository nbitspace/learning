#Redis client commands:

#redis-cli
#redis-cli PING
redis-cli -h 127.0.0.1 -p 6379 -a password PING

#CommandFormat: <command> <key> <values>
#ScriptFormat: echo <redis-cli command> | redis-cli


#debug, verbose, warning ...

#CONFIG SET loglevel debug
echo CONFIG SET loglevel debug | redis-cli

echo SET popular-song ranjithamae | redis-cli

#String
SET popular-song ranjithamae
GET popular-song
SET popular-song "poopol poopol"
GET popular-song
EXISTS popular-song
DEL popular-song
EXISTS popular-song

#HashMap
HMSET 5873 reg 5873 model "Z" "colour" "dark blue"
HGETALL 5873
HGET 5873 colour
HDEL 5873 model
HEXISTS 5873 model
HKEYS 5873
HVALS 5873
HINCRBY 5873 reg 2
HLEN 5873

#List
LPUSH colours green blue black "dark green" light-green light:grey
LRANGE colours 0 10
LRANGE colours 2 4
LINDEX colours 3
LLEN colours
LPOP colours
LPOP colours 2
RPOP colours
BLPOP colours 15
LPUSHX colours green red
LSET colours 7 yellow
RPUSH colours red
RPUSHX colours red

#Sets
SADD movies varisu thunivu
sadd movies varisu
SISMEMBER movies thunivu
SMEMBERS movies
SCARD movies
SMOVE movies goodmovies thunivu
SPOP movies
SINTER movies goodmovies
SINTERSTORE matchingmovies movies goodmovies
SUNION movies goodmovies
SUNIONSTORE matchingmovies movies goodmovies
SSCAN matchingmovies 0 MATCH v*

#Sorted Sets
ZADD classes 0 redis 1 postgres 5 hbase 10 java
ZRANGEBYSCORE classes 0 10
ZCARD classes
ZCOUNT classes 2 9
ZRANGE classes 0 10
ZRANGE classes 0 10 WITHSCORES
ZINCRBY classes 5 java
ZRANK classes java
ZREM classes java

#Transaction
MULTI
EXEC
DISCARD
WATCH #TODO
UNWATCH







