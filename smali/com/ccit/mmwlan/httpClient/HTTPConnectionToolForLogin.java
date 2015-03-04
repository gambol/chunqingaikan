package com.ccit.mmwlan.httpClient; class HTTPConnectionToolForLogin { void a() { int a;
a=0;// .class public Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HTTPConnectionToolForLogin.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final APPIDDATA_END:Ljava/lang/String; = "</appid>"
a=0;// 
a=0;// .field private static final APPIDDATA_START:Ljava/lang/String; = "<appid>"
a=0;// 
a=0;// .field private static final CONN_TIME_OUT:I
a=0;// 
a=0;// .field private static final DEVICEIDDATA_END:Ljava/lang/String; = "</deviceid>"
a=0;// 
a=0;// .field private static final DEVICEIDDATA_START:Ljava/lang/String; = "<deviceid>"
a=0;// 
a=0;// .field private static final IDMODEDATA_END:Ljava/lang/String; = "</id_mode>"
a=0;// 
a=0;// .field private static final IDMODEDATA_START:Ljava/lang/String; = "<id_mode>"
a=0;// 
a=0;// .field private static final IMSIDATA_END:Ljava/lang/String; = "</imsi>"
a=0;// 
a=0;// .field private static final IMSIDATA_START:Ljava/lang/String; = "<imsi>"
a=0;// 
a=0;// .field private static final LOGINTYPEDATA_END:Ljava/lang/String; = "</loginType>"
a=0;// 
a=0;// .field private static final LOGINTYPEDATA_START:Ljava/lang/String; = "<loginType>"
a=0;// 
a=0;// .field private static final PASSCODEDATA_END:Ljava/lang/String; = "</passCode>"
a=0;// 
a=0;// .field private static final PASSCODEDATA_START:Ljava/lang/String; = "<passCode>"
a=0;// 
a=0;// .field private static final PUBKEYDATA_END:Ljava/lang/String; = "</pubkey>"
a=0;// 
a=0;// .field private static final PUBKEYDATA_START:Ljava/lang/String; = "<pubkey>"
a=0;// 
a=0;// .field private static final READ_TIME_OUT:I
a=0;// 
a=0;// .field private static final SERVLET_POST:Ljava/lang/String; = "POST"
a=0;// 
a=0;// .field private static final SIDDATA_END:Ljava/lang/String; = "</sid>"
a=0;// 
a=0;// .field private static final SIDDATA_START:Ljava/lang/String; = "<sid>"
a=0;// 
a=0;// .field private static final USERNAMEDATA_END:Ljava/lang/String; = "</userName>"
a=0;// 
a=0;// .field private static final USERNAMEDATA_START:Ljava/lang/String; = "<userName>"
a=0;// 
a=0;// .field private static final XMLLABLE_END:Ljava/lang/String; = "</request>"
a=0;// 
a=0;// .field private static final XMLLABLE_START:Ljava/lang/String; = "<request>"
a=0;// 
a=0;// .field private static final XMLTitle:Ljava/lang/String; = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
a=0;// 
a=0;// .field private static connectTimeout:Ljava/lang/String;
a=0;// 
a=0;// .field private static readConfigFile:Lcom/ccit/mmwlan/util/ReadConfigFile;
a=0;// 
a=0;// .field private static readTimeout:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     new-instance v0, Lcom/ccit/mmwlan/util/ReadConfigFile;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/ccit/mmwlan/util/ReadConfigFile;);
a=0;//     invoke-direct {v0}, Lcom/ccit/mmwlan/util/ReadConfigFile;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/util/ReadConfigFile;);
a=0;//     sput-object v0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->readConfigFile:Lcom/ccit/mmwlan/util/ReadConfigFile;
a=0;// 
a=0;//     .line 92
a=0;//     sget-object v0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->readConfigFile:Lcom/ccit/mmwlan/util/ReadConfigFile;
a=0;// 
a=0;//     .line 93
a=0;//     const-string v1, "connectTimeout"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/ccit/mmwlan/util/ReadConfigFile;->getConfigInfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 92
a=0;//     sput-object v0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->connectTimeout:Ljava/lang/String;
a=0;// 
a=0;//     .line 94
a=0;//     sget-object v0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->readConfigFile:Lcom/ccit/mmwlan/util/ReadConfigFile;
a=0;// 
a=0;//     .line 95
a=0;//     const-string v1, "readTimeout"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/ccit/mmwlan/util/ReadConfigFile;->getConfigInfo(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     sput-object v0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->readTimeout:Ljava/lang/String;
a=0;// 
a=0;//     .line 97
a=0;//     sget-object v0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->connectTimeout:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->CONN_TIME_OUT:I
a=0;// 
a=0;//     .line 98
a=0;//     sget-object v0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->readTimeout:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->READ_TIME_OUT:I
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public applyCertRequestXML(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "appid"    # Ljava/lang/String;
a=0;//     .param p2, "sid"    # Ljava/lang/String;
a=0;//     .param p3, "pubkey"    # Ljava/lang/String;
a=0;//     .param p4, "deviceid"    # Ljava/lang/String;
a=0;//     .param p5, "loginType"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 161
a=0;//     .local v0, "result":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<request>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 165
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<sid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</sid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<pubkey>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 167
a=0;//     const-string v2, "</pubkey>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<imsi>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</imsi>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<id_mode>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 170
a=0;//     const-string v2, "</id_mode>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<appid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</appid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "</request>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 176
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public applyCertRequest_N_XML(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "appid"    # Ljava/lang/String;
a=0;//     .param p2, "sid"    # Ljava/lang/String;
a=0;//     .param p3, "pubkey"    # Ljava/lang/String;
a=0;//     .param p4, "deviceid"    # Ljava/lang/String;
a=0;//     .param p5, "loginType"    # Ljava/lang/String;
a=0;//     .param p6, "userName"    # Ljava/lang/String;
a=0;//     .param p7, "passCode"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 121
a=0;//     .local v0, "result":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<request>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<sid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</sid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<pubkey>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 127
a=0;//     const-string v2, "</pubkey>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<deviceid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 129
a=0;//     const-string v2, "</deviceid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<loginType>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 131
a=0;//     const-string v2, "</loginType>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<userName>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 133
a=0;//     const-string v2, "</userName>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<passCode>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 135
a=0;//     const-string v2, "</passCode>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<appid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</appid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "</request>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 141
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public doPost(Ljava/lang/String;[BLorg/apache/http/HttpHost;)[B
a=0;//     .locals 16
a=0;//     .param p1, "urlStr"    # Ljava/lang/String;
a=0;//     .param p2, "byteRequest"    # [B
a=0;//     .param p3, "wapHost"    # Lorg/apache/http/HttpHost;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     const-string v13, "MmClientSdk"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "doPost() url -> "
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v13, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 194
a=0;//     new-instance v10, Ljava/lang/String;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v13, "UTF-8"
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-direct {v10, v0, v13}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 195
a=0;//     .local v10, "requestStr":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "MmClientSdk"
a=0;// 
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "doPost() request -> "
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v13, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 197
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     array-length v5, v0
a=0;// 
a=0;//     .line 198
a=0;//     .local v5, "messageBodyLen":I
a=0;//     #v5=(Integer);
a=0;//     new-instance v12, Ljava/net/URL;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/net/URL;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-direct {v12, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 200
a=0;//     .local v12, "url":Ljava/net/URL;
a=0;//     #v12=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v2, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 202
a=0;//     .local v2, "conn":Ljava/net/HttpURLConnection;
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 203
a=0;//     new-instance v8, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 204
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->getPort()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 203
a=0;//     #v14=(Integer);
a=0;//     invoke-direct {v8, v13, v14}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 205
a=0;//     .local v8, "proxy":Ljava/net/SocketAddress;
a=0;//     #v8=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     new-instance v13, Ljava/net/Proxy;
a=0;// 
a=0;//     .line 206
a=0;//     #v13=(UninitRef,Ljava/net/Proxy;);
a=0;//     sget-object v14, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;
a=0;// 
a=0;//     #v14=(Reference,Ljava/net/Proxy$Type;);
a=0;//     invoke-direct {v13, v14, v8}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     .line 205
a=0;//     #v13=(Reference,Ljava/net/Proxy;);
a=0;//     invoke-virtual {v12, v13}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .end local v2    # "conn":Ljava/net/HttpURLConnection;
a=0;//     check-cast v2, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 207
a=0;//     .restart local v2    # "conn":Ljava/net/HttpURLConnection;
a=0;//     const-string v13, "MmClientSdk"
a=0;// 
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "doPost()  used wapHost -> "
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 208
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     const-string v15, ":"
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->getPort()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 207
a=0;//     invoke-static {v13, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 213
a=0;//     .end local v8    # "proxy":Ljava/net/SocketAddress;
a=0;//     :goto_0
a=0;//     #v8=(Conflicted);v15=(Conflicted);
a=0;//     sget v13, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->CONN_TIME_OUT:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-virtual {v2, v13}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 214
a=0;//     sget v13, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->READ_TIME_OUT:I
a=0;// 
a=0;//     invoke-virtual {v2, v13}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 215
a=0;//     const-string v13, "POST"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v13}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 216
a=0;//     const-string v13, "Connection"
a=0;// 
a=0;//     const-string v14, "close"
a=0;// 
a=0;//     invoke-virtual {v2, v13, v14}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 217
a=0;//     const-string v13, "Charset"
a=0;// 
a=0;//     const-string v14, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v2, v13, v14}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 218
a=0;//     const-string v13, "Content-Type"
a=0;// 
a=0;//     const-string v14, "text/xml"
a=0;// 
a=0;//     invoke-virtual {v2, v13, v14}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 219
a=0;//     const-string v13, "Content-length"
a=0;// 
a=0;//     .line 220
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 219
a=0;//     invoke-virtual {v2, v13, v14}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 222
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     invoke-virtual {v2, v13}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     .line 223
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     invoke-virtual {v2, v13}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     .line 224
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     invoke-virtual {v2, v13}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 227
a=0;//     .local v6, "os":Ljava/io/OutputStream;
a=0;//     #v6=(Reference,Ljava/io/OutputStream;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 228
a=0;//     invoke-virtual {v6}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 229
a=0;//     invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
a=0;// 
a=0;//     .line 231
a=0;//     new-instance v3, Ljava/io/DataInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/DataInputStream;);
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-direct {v3, v13}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 232
a=0;//     .local v3, "input":Ljava/io/DataInputStream;
a=0;//     #v3=(Reference,Ljava/io/DataInputStream;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     check-cast v9, [B
a=0;// 
a=0;//     .line 233
a=0;//     .local v9, "rResult":[B
a=0;//     #v9=(Reference,[B);
a=0;//     new-instance v7, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 234
a=0;//     .local v7, "out":Ljava/io/ByteArrayOutputStream;
a=0;//     #v7=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v13, 0x1000
a=0;// 
a=0;//     #v13=(PosShort);
a=0;//     new-array v1, v13, [B
a=0;// 
a=0;//     .line 235
a=0;//     .local v1, "bufferByte":[B
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 236
a=0;//     .local v4, "l":I
a=0;//     :goto_1
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v1}, Ljava/io/DataInputStream;->read([B)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/4 v13, -0x1
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-gt v4, v13, :cond_1
a=0;// 
a=0;//     .line 240
a=0;//     invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 241
a=0;//     new-instance v11, Ljava/lang/String;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v13, "UTF-8"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v9, v13}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 242
a=0;//     .local v11, "responseStr":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "MmClientSdk"
a=0;// 
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "doPost() response -> "
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v13, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 243
a=0;//     return-object v9
a=0;// 
a=0;//     .line 210
a=0;//     .end local v1    # "bufferByte":[B
a=0;//     .end local v3    # "input":Ljava/io/DataInputStream;
a=0;//     .end local v4    # "l":I
a=0;//     .end local v6    # "os":Ljava/io/OutputStream;
a=0;//     .end local v7    # "out":Ljava/io/ByteArrayOutputStream;
a=0;//     .end local v9    # "rResult":[B
a=0;//     .end local v11    # "responseStr":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);
a=0;//     invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .end local v2    # "conn":Ljava/net/HttpURLConnection;
a=0;//     check-cast v2, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .restart local v2    # "conn":Ljava/net/HttpURLConnection;
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 237
a=0;//     .restart local v1    # "bufferByte":[B
a=0;//     .restart local v3    # "input":Ljava/io/DataInputStream;
a=0;//     .restart local v4    # "l":I
a=0;//     .restart local v6    # "os":Ljava/io/OutputStream;
a=0;//     .restart local v7    # "out":Ljava/io/ByteArrayOutputStream;
a=0;//     .restart local v9    # "rResult":[B
a=0;//     :cond_1
a=0;//     #v1=(Reference,[B);v3=(Reference,Ljava/io/DataInputStream;);v4=(Integer);v6=(Reference,Ljava/io/OutputStream;);v7=(Reference,Ljava/io/ByteArrayOutputStream;);v8=(Conflicted);v9=(Reference,[B);v13=(Byte);v15=(Conflicted);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     invoke-virtual {v7, v1, v13, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     .line 238
a=0;//     invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public doPostByHttpClient(Ljava/lang/String;[BLorg/apache/http/HttpHost;)[B
a=0;//     .locals 16
a=0;//     .param p1, "requestUrl"    # Ljava/lang/String;
a=0;//     .param p2, "byteRequest"    # [B
a=0;//     .param p3, "wapProxy"    # Lorg/apache/http/HttpHost;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     const-string v13, "MmClientSdk"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "doPostByHttpClient() url -> "
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 261
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 260
a=0;//     invoke-static {v13, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 262
a=0;//     new-instance v10, Ljava/lang/String;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v13, "UTF-8"
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-direct {v10, v0, v13}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 263
a=0;//     .local v10, "requestStr":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "MmClientSdk"
a=0;// 
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "doPostByHttpClient() request -> "
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 264
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 263
a=0;//     invoke-static {v13, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 272
a=0;//     new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     .line 275
a=0;//     .local v3, "client":Lorg/apache/http/client/HttpClient;
a=0;//     #v3=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 276
a=0;//     .local v8, "params":Lorg/apache/http/params/HttpParams;
a=0;//     #v8=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     sget v13, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->CONN_TIME_OUT:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-static {v8, v13}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 277
a=0;//     sget v13, Lcom/ccit/mmwlan/httpClient/HTTPConnectionToolForLogin;->READ_TIME_OUT:I
a=0;// 
a=0;//     invoke-static {v8, v13}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 280
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v13, :cond_0
a=0;// 
a=0;//     .line 281
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     const-string v14, ""
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-nez v13, :cond_0
a=0;// 
a=0;//     .line 283
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     const-string v14, "http.route.default-proxy"
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-interface {v13, v14, v0}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     .line 285
a=0;//     const-string v13, "MmClientSdk"
a=0;// 
a=0;//     .line 286
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "doPostByHttpClient()  used wapHost -> "
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 287
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     const-string v15, ":"
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->getPort()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 286
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 285
a=0;//     invoke-static {v13, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 290
a=0;//     :cond_0
a=0;//     #v13=(Conflicted);v15=(Conflicted);
a=0;//     new-instance v6, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v6=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-direct {v6, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 291
a=0;//     .local v6, "hp":Lorg/apache/http/client/methods/HttpPost;
a=0;//     #v6=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     const-string v13, "Charset"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     const-string v14, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v6, v13, v14}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 292
a=0;//     const-string v13, "Content-Type"
a=0;// 
a=0;//     const-string v14, "text/xml"
a=0;// 
a=0;//     invoke-virtual {v6, v13, v14}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 294
a=0;//     new-instance v5, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-direct {v5, v0}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;// 
a=0;//     .line 296
a=0;//     .local v5, "entity":Lorg/apache/http/entity/ByteArrayEntity;
a=0;//     #v5=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-virtual {v6, v5}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 298
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 299
a=0;//     .local v11, "response":Lorg/apache/http/HttpResponse;
a=0;//     #v11=(Null);
a=0;//     invoke-interface {v3, v6}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 302
a=0;//     #v11=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     new-instance v4, Ljava/io/DataInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/DataInputStream;);
a=0;//     invoke-interface {v11}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 303
a=0;//     invoke-interface {v13}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 302
a=0;//     invoke-direct {v4, v13}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 304
a=0;//     .local v4, "dis":Ljava/io/DataInputStream;
a=0;//     #v4=(Reference,Ljava/io/DataInputStream;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     check-cast v9, [B
a=0;// 
a=0;//     .line 305
a=0;//     .local v9, "rResult":[B
a=0;//     #v9=(Reference,[B);
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 306
a=0;//     .local v1, "baos":Ljava/io/ByteArrayOutputStream;
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v13, 0x1000
a=0;// 
a=0;//     #v13=(PosShort);
a=0;//     new-array v2, v13, [B
a=0;// 
a=0;//     .line 307
a=0;//     .local v2, "bufferByte":[B
a=0;//     #v2=(Reference,[B);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     .line 308
a=0;//     .local v7, "l":I
a=0;//     :goto_0
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v4, v2}, Ljava/io/DataInputStream;->read([B)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     const/4 v13, -0x1
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-gt v7, v13, :cond_1
a=0;// 
a=0;//     .line 315
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v13}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     .line 317
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 318
a=0;//     new-instance v12, Ljava/lang/String;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v13, "UTF-8"
a=0;// 
a=0;//     invoke-direct {v12, v9, v13}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 319
a=0;//     .local v12, "responseStr":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "MmClientSdk"
a=0;// 
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "doPost() response -> "
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v13, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 320
a=0;//     return-object v9
a=0;// 
a=0;//     .line 309
a=0;//     .end local v12    # "responseStr":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v12=(Uninit);v13=(Byte);v15=(Conflicted);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     invoke-virtual {v1, v2, v13, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     .line 310
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
