# Azure-Spring-Starter

# SSL certification generation 
keytool -genkeypair -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore file_name.p12 -validity 365

# Properties to include in spring boot app - start

# SSL
server.port=8443 <br />
server.ssl.key-store=classpath:mkyong.p12
server.ssl.key-store-password=123456

# PKCS12 or JKS
server.ssl.keyStoreType=PKCS12

# Properties to include in spring boot app - end
