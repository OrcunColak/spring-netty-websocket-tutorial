# Read Me First

The original idea is from  
https://jxausea.medium.com/spring-boot-intergratd-netty-implements-websocket-communication-2302e09cf748

1. Using a web socket client connect to ws://127.0.0.1:8889/webSocket
2. From the web socket client send message {'uid':'sss'}
3. From the browser send GET request to http://localhost:8088/push/sss
4. The web socket client should receive a message