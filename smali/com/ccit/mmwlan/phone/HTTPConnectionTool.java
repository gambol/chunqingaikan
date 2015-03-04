package com.ccit.mmwlan.phone; class HTTPConnectionTool { void a() { int a;
a=0;// .class public Lcom/ccit/mmwlan/phone/HTTPConnectionTool;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HTTPConnectionTool.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final APPUIDDATA_END:Ljava/lang/String; = "</appuid>"
a=0;// 
a=0;// .field private static final APPUIDDATA_START:Ljava/lang/String; = "<appuid>"
a=0;// 
a=0;// .field private static final HTTPCONNTOOL:Ljava/lang/String; = "HTTPConnectionTool"
a=0;// 
a=0;// .field private static final IMSIDATA_END:Ljava/lang/String; = "</imsi>"
a=0;// 
a=0;// .field private static final IMSIDATA_START:Ljava/lang/String; = "<imsi>"
a=0;// 
a=0;// .field private static final PUBKEYDATA_END:Ljava/lang/String; = "</pubkey>"
a=0;// 
a=0;// .field private static final PUBKEYDATA_START:Ljava/lang/String; = "<pubkey>"
a=0;// 
a=0;// .field private static final SERVLET_POST:Ljava/lang/String; = "POST"
a=0;// 
a=0;// .field private static final SIDDATA_END:Ljava/lang/String; = "</sid>"
a=0;// 
a=0;// .field private static final SIDDATA_START:Ljava/lang/String; = "<sid>"
a=0;// 
a=0;// .field private static final XMLLABLE_END:Ljava/lang/String; = "</request>"
a=0;// 
a=0;// .field private static final XMLLABLE_START:Ljava/lang/String; = "<request>"
a=0;// 
a=0;// .field private static final XMLTitle:Ljava/lang/String; = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/phone/HTTPConnectionTool;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public ConbinCertApply(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "strSid"    # Ljava/lang/String;
a=0;//     .param p2, "strPubKey"    # Ljava/lang/String;
a=0;//     .param p3, "strImsi"    # Ljava/lang/String;
a=0;//     .param p4, "strAppUid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "result":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iput-object v1, p0, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<request>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<sid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</sid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<appuid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 74
a=0;//     const-string v2, "</appuid>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 75
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<pubkey>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 76
a=0;//     const-string v2, "</pubkey>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "<imsi>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "</imsi>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v2, "</request>"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/phone/HTTPConnectionTool;->strBuilder:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 82
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public doPost(Ljava/lang/String;[BLorg/apache/http/HttpHost;Ljava/lang/String;)[B
a=0;//     .locals 17
a=0;//     .param p1, "urlStr"    # Ljava/lang/String;
a=0;//     .param p2, "byteRequest"    # [B
a=0;//     .param p3, "gHttpProxy"    # Lorg/apache/http/HttpHost;
a=0;//     .param p4, "strFlag"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     const-string v14, "HTTPConnectionTool"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "doPost() url -> "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 216
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 217
a=0;//     const-string v14, "HTTPConnectionTool"
a=0;// 
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "doPost() proxy ->"
a=0;// 
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->toURI()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 222
a=0;//     :goto_0
a=0;//     new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     .line 224
a=0;//     .local v3, "client":Lorg/apache/http/client/HttpClient;
a=0;//     #v3=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     if-eqz p4, :cond_2
a=0;// 
a=0;//     .line 226
a=0;//     invoke-static/range {p4 .. p4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     .line 227
a=0;//     .local v12, "sleepTime":J
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     const-wide/16 v14, 0x3e8
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     mul-long/2addr v12, v14
a=0;// 
a=0;//     .line 228
a=0;//     monitor-enter v3
a=0;// 
a=0;//     .line 234
a=0;//     :try_start_0
a=0;//     invoke-virtual {v3, v12, v13}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 228
a=0;//     monitor-exit v3
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 256
a=0;//     .end local v12    # "sleepTime":J
a=0;//     :goto_1
a=0;//     #v12=(Conflicted);v13=(Conflicted);
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 257
a=0;//     .local v8, "params":Lorg/apache/http/params/HttpParams;
a=0;//     #v8=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     const/16 v14, 0x4e20
a=0;// 
a=0;//     #v14=(PosShort);
a=0;//     invoke-static {v8, v14}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 258
a=0;//     const/16 v14, 0x7530
a=0;// 
a=0;//     invoke-static {v8, v14}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 260
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v14, :cond_0
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     const-string v15, ""
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-nez v14, :cond_0
a=0;// 
a=0;//     .line 261
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     const-string v15, "http.route.default-proxy"
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-interface {v14, v15, v0}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     .line 262
a=0;//     const-string v14, "HTTPConnectionTool"
a=0;// 
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "doPostByHttpClient()  used wapHost -> "
a=0;// 
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, ":"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->getPort()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 264
a=0;//     :cond_0
a=0;//     #v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     new-instance v6, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v6=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-direct {v6, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 265
a=0;//     .local v6, "hp":Lorg/apache/http/client/methods/HttpPost;
a=0;//     #v6=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     const-string v14, "Charset"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     const-string v15, "UTF-8"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v14, v15}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 266
a=0;//     const-string v14, "Content-Type"
a=0;// 
a=0;//     const-string v15, "text/xml"
a=0;// 
a=0;//     invoke-virtual {v6, v14, v15}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 268
a=0;//     new-instance v5, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-direct {v5, v0}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;// 
a=0;//     .line 270
a=0;//     .local v5, "entity":Lorg/apache/http/entity/ByteArrayEntity;
a=0;//     #v5=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-virtual {v6, v5}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 272
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 273
a=0;//     .local v10, "response":Lorg/apache/http/HttpResponse;
a=0;//     #v10=(Null);
a=0;//     invoke-interface {v3, v6}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 276
a=0;//     #v10=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     new-instance v4, Ljava/io/DataInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/DataInputStream;);
a=0;//     invoke-interface {v10}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 277
a=0;//     invoke-interface {v14}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 276
a=0;//     invoke-direct {v4, v14}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 278
a=0;//     .local v4, "dis":Ljava/io/DataInputStream;
a=0;//     #v4=(Reference,Ljava/io/DataInputStream;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     check-cast v9, [B
a=0;// 
a=0;//     .line 279
a=0;//     .local v9, "rResult":[B
a=0;//     #v9=(Reference,[B);
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 280
a=0;//     .local v1, "baos":Ljava/io/ByteArrayOutputStream;
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v14, 0x1000
a=0;// 
a=0;//     #v14=(PosShort);
a=0;//     new-array v2, v14, [B
a=0;// 
a=0;//     .line 281
a=0;//     .local v2, "bufferByte":[B
a=0;//     #v2=(Reference,[B);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     .line 282
a=0;//     .local v7, "l":I
a=0;//     :goto_2
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v4, v2}, Ljava/io/DataInputStream;->read([B)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     const/4 v14, -0x1
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-gt v7, v14, :cond_3
a=0;// 
a=0;//     .line 289
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v14}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     .line 291
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 292
a=0;//     new-instance v11, Ljava/lang/String;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v14, "UTF-8"
a=0;// 
a=0;//     invoke-direct {v11, v9, v14}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 293
a=0;//     .local v11, "responseStr":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     const-string v14, "HTTPConnectionTool"
a=0;// 
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "doPost() responnse StatusCode="
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v10}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-interface/range {v16 .. v16}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, " StatusReason="
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-interface {v10}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-interface/range {v16 .. v16}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 294
a=0;//     const-string v14, "HTTPConnectionTool"
a=0;// 
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "doPost() response -> "
a=0;// 
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 295
a=0;//     return-object v9
a=0;// 
a=0;//     .line 219
a=0;//     .end local v1    # "baos":Ljava/io/ByteArrayOutputStream;
a=0;//     .end local v2    # "bufferByte":[B
a=0;//     .end local v3    # "client":Lorg/apache/http/client/HttpClient;
a=0;//     .end local v4    # "dis":Ljava/io/DataInputStream;
a=0;//     .end local v5    # "entity":Lorg/apache/http/entity/ByteArrayEntity;
a=0;//     .end local v6    # "hp":Lorg/apache/http/client/methods/HttpPost;
a=0;//     .end local v7    # "l":I
a=0;//     .end local v8    # "params":Lorg/apache/http/params/HttpParams;
a=0;//     .end local v9    # "rResult":[B
a=0;//     .end local v10    # "response":Lorg/apache/http/HttpResponse;
a=0;//     .end local v11    # "responseStr":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     const-string v14, "HTTPConnectionTool"
a=0;// 
a=0;//     const-string v15, "doPost() without proxy ->"
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 228
a=0;//     .restart local v3    # "client":Lorg/apache/http/client/HttpClient;
a=0;//     .restart local v12    # "sleepTime":J
a=0;//     :catchall_0
a=0;//     #v3=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);v12=(LongLo);v13=(LongHi);v14=(Conflicted);v15=(LongHi);
a=0;//     move-exception v14
a=0;// 
a=0;//     :try_start_1
a=0;//     #v14=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v14
a=0;// 
a=0;//     .line 242
a=0;//     .end local v12    # "sleepTime":J
a=0;//     :cond_2
a=0;//     #v12=(Uninit);v13=(Uninit);v15=(Reference,Ljava/lang/String;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     .line 247
a=0;//     const-wide/16 v14, 0x1b58
a=0;// 
a=0;//     :try_start_2
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     invoke-virtual {v3, v14, v15}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 242
a=0;//     monitor-exit v3
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v14=(Conflicted);
a=0;//     move-exception v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     throw v14
a=0;// 
a=0;//     .line 283
a=0;//     .restart local v1    # "baos":Ljava/io/ByteArrayOutputStream;
a=0;//     .restart local v2    # "bufferByte":[B
a=0;//     .restart local v4    # "dis":Ljava/io/DataInputStream;
a=0;//     .restart local v5    # "entity":Lorg/apache/http/entity/ByteArrayEntity;
a=0;//     .restart local v6    # "hp":Lorg/apache/http/client/methods/HttpPost;
a=0;//     .restart local v7    # "l":I
a=0;//     .restart local v8    # "params":Lorg/apache/http/params/HttpParams;
a=0;//     .restart local v9    # "rResult":[B
a=0;//     .restart local v10    # "response":Lorg/apache/http/HttpResponse;
a=0;//     :cond_3
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);v2=(Reference,[B);v4=(Reference,Ljava/io/DataInputStream;);v5=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);v6=(Reference,Lorg/apache/http/client/methods/HttpPost;);v7=(Integer);v8=(Reference,Lorg/apache/http/params/HttpParams;);v9=(Reference,[B);v10=(Reference,Lorg/apache/http/HttpResponse;);v12=(Conflicted);v13=(Conflicted);v14=(Byte);v15=(Reference,Ljava/lang/String;);v16=(Conflicted);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v1, v2, v14, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     .line 284
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public doPost_0ld(Ljava/lang/String;[BLorg/apache/http/HttpHost;Ljava/lang/String;)[B
a=0;//     .locals 16
a=0;//     .param p1, "urlStr"    # Ljava/lang/String;
a=0;//     .param p2, "byteRequest"    # [B
a=0;//     .param p3, "gHttpProxy"    # Lorg/apache/http/HttpHost;
a=0;//     .param p4, "strFlag"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v6, v0
a=0;// 
a=0;//     .line 101
a=0;//     .local v6, "messageBodyLen":I
a=0;//     #v6=(Integer);
a=0;//     new-instance v13, Ljava/net/URL;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/net/URL;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-direct {v13, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 107
a=0;//     .local v13, "url":Ljava/net/URL;
a=0;//     #v13=(Reference,Ljava/net/URL;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 108
a=0;//     .local v2, "conn":Ljava/net/HttpURLConnection;
a=0;//     #v2=(Null);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v9, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     .line 111
a=0;//     #v9=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->getHostName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p3 .. p3}, Lorg/apache/http/HttpHost;->getPort()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 110
a=0;//     #v15=(Integer);
a=0;//     invoke-direct {v9, v14, v15}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 112
a=0;//     .local v9, "proxy":Ljava/net/SocketAddress;
a=0;//     #v9=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     new-instance v14, Ljava/net/Proxy;
a=0;// 
a=0;//     .line 113
a=0;//     #v14=(UninitRef,Ljava/net/Proxy;);
a=0;//     sget-object v15, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;
a=0;// 
a=0;//     #v15=(Reference,Ljava/net/Proxy$Type;);
a=0;//     invoke-direct {v14, v15, v9}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     .line 112
a=0;//     #v14=(Reference,Ljava/net/Proxy;);
a=0;//     invoke-virtual {v13, v14}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .end local v2    # "conn":Ljava/net/HttpURLConnection;
a=0;//     #v2=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v2, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 138
a=0;//     .end local v9    # "proxy":Ljava/net/SocketAddress;
a=0;//     .restart local v2    # "conn":Ljava/net/HttpURLConnection;
a=0;//     :goto_0
a=0;//     #v9=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     .line 140
a=0;//     invoke-static/range {p4 .. p4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v11
a=0;// 
a=0;//     .line 141
a=0;//     .local v11, "sleepTime":J
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     const-wide/16 v14, 0x3e8
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     mul-long/2addr v11, v14
a=0;// 
a=0;//     .line 142
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 148
a=0;//     :try_start_0
a=0;//     invoke-virtual {v2, v11, v12}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 142
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 168
a=0;//     .end local v11    # "sleepTime":J
a=0;//     :goto_1
a=0;//     #v11=(Conflicted);v12=(Conflicted);
a=0;//     const-string v14, "POST"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v14}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 169
a=0;//     const-string v14, "Connection"
a=0;// 
a=0;//     const-string v15, "close"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v14, v15}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 170
a=0;//     const-string v14, "Charset"
a=0;// 
a=0;//     const-string v15, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v2, v14, v15}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 171
a=0;//     const-string v14, "Content-Type"
a=0;// 
a=0;//     const-string v15, "text/xml"
a=0;// 
a=0;//     invoke-virtual {v2, v14, v15}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 173
a=0;//     const-string v14, "Content-length"
a=0;// 
a=0;//     .line 174
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 173
a=0;//     invoke-virtual {v2, v14, v15}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 176
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     invoke-virtual {v2, v14}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     .line 177
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     invoke-virtual {v2, v14}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     .line 178
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v2, v14}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V
a=0;// 
a=0;//     .line 179
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 181
a=0;//     .local v7, "os":Ljava/io/OutputStream;
a=0;//     #v7=(Reference,Ljava/io/OutputStream;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 182
a=0;//     invoke-virtual {v7}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 183
a=0;//     invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v4, Ljava/io/DataInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/DataInputStream;);
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-direct {v4, v14}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 186
a=0;//     .local v4, "input":Ljava/io/DataInputStream;
a=0;//     #v4=(Reference,Ljava/io/DataInputStream;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     check-cast v10, [B
a=0;// 
a=0;//     .line 187
a=0;//     .local v10, "rResult":[B
a=0;//     #v10=(Reference,[B);
a=0;//     new-instance v8, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 188
a=0;//     .local v8, "out":Ljava/io/ByteArrayOutputStream;
a=0;//     #v8=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v14, 0x1770
a=0;// 
a=0;//     #v14=(PosShort);
a=0;//     new-array v1, v14, [B
a=0;// 
a=0;//     .line 189
a=0;//     .local v1, "bufferByte":[B
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 190
a=0;//     .local v5, "l":I
a=0;//     #v5=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 191
a=0;//     .local v3, "downloadSize":I
a=0;//     :goto_2
a=0;//     #v3=(Integer);v5=(Integer);
a=0;//     invoke-virtual {v4, v1}, Ljava/io/DataInputStream;->read([B)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     const/4 v14, -0x1
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-gt v5, v14, :cond_2
a=0;// 
a=0;//     .line 196
a=0;//     invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 198
a=0;//     return-object v10
a=0;// 
a=0;//     .line 116
a=0;//     .end local v1    # "bufferByte":[B
a=0;//     .end local v3    # "downloadSize":I
a=0;//     .end local v4    # "input":Ljava/io/DataInputStream;
a=0;//     .end local v5    # "l":I
a=0;//     .end local v7    # "os":Ljava/io/OutputStream;
a=0;//     .end local v8    # "out":Ljava/io/ByteArrayOutputStream;
a=0;//     .end local v10    # "rResult":[B
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v14=(Uninit);v15=(Uninit);
a=0;//     invoke-virtual {v13}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .end local v2    # "conn":Ljava/net/HttpURLConnection;
a=0;//     #v2=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v2, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .restart local v2    # "conn":Ljava/net/HttpURLConnection;
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 142
a=0;//     .restart local v11    # "sleepTime":J
a=0;//     :catchall_0
a=0;//     #v9=(Conflicted);v11=(LongLo);v12=(LongHi);v14=(Conflicted);v15=(LongHi);
a=0;//     move-exception v14
a=0;// 
a=0;//     :try_start_1
a=0;//     #v14=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v14
a=0;// 
a=0;//     .line 156
a=0;//     .end local v11    # "sleepTime":J
a=0;//     :cond_1
a=0;//     #v11=(Uninit);v12=(Uninit);v14=(Conflicted);v15=(Conflicted);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 161
a=0;//     const-wide/16 v14, 0x1b58
a=0;// 
a=0;//     :try_start_2
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     invoke-virtual {v2, v14, v15}, Ljava/lang/Object;->wait(J)V
a=0;// 
a=0;//     .line 156
a=0;//     monitor-exit v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_1
a=0;//     #v14=(Conflicted);
a=0;//     move-exception v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     throw v14
a=0;// 
a=0;//     .line 192
a=0;//     .restart local v1    # "bufferByte":[B
a=0;//     .restart local v3    # "downloadSize":I
a=0;//     .restart local v4    # "input":Ljava/io/DataInputStream;
a=0;//     .restart local v5    # "l":I
a=0;//     .restart local v7    # "os":Ljava/io/OutputStream;
a=0;//     .restart local v8    # "out":Ljava/io/ByteArrayOutputStream;
a=0;//     .restart local v10    # "rResult":[B
a=0;//     :cond_2
a=0;//     #v1=(Reference,[B);v3=(Integer);v4=(Reference,Ljava/io/DataInputStream;);v5=(Integer);v7=(Reference,Ljava/io/OutputStream;);v8=(Reference,Ljava/io/ByteArrayOutputStream;);v10=(Reference,[B);v11=(Conflicted);v12=(Conflicted);v14=(Byte);v15=(Reference,Ljava/lang/String;);
a=0;//     add-int/2addr v3, v5
a=0;// 
a=0;//     .line 193
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v8, v1, v14, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
