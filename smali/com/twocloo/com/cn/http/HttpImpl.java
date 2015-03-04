package com.twocloo.com.cn.http; class HttpImpl { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/http/HttpImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HttpImpl.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static url:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/HttpImpl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static ParseJson(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 10
a=0;//     .param p0, "path"    # Ljava/lang/String;
a=0;//     .param p1, "encode"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v8, 0x2710
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1231
a=0;//     #v7=(Null);
a=0;//     new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     .line 1232
a=0;//     .local v1, "httpClient":Lorg/apache/http/client/HttpClient;
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1233
a=0;//     .local v2, "httpParams":Lorg/apache/http/params/HttpParams;
a=0;//     #v2=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     invoke-static {v2, v8}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 1234
a=0;//     invoke-static {v2, v8}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 1235
a=0;//     new-instance v3, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v3, p0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1237
a=0;//     .local v3, "httpPost":Lorg/apache/http/client/methods/HttpPost;
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-interface {v1, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1238
a=0;//     .local v4, "httpResponse":Lorg/apache/http/HttpResponse;
a=0;//     #v4=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/16 v9, 0xc8
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     if-ne v8, v9, :cond_6
a=0;// 
a=0;//     .line 1239
a=0;//     invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-static {v8, p1}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1240
a=0;//     .local v6, "result":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 1257
a=0;//     .local v5, "jsonObject":Lorg/json/JSONObject;
a=0;//     #v5=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1258
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v7}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     .line 1260
a=0;//     .end local v4    # "httpResponse":Lorg/apache/http/HttpResponse;
a=0;//     .end local v5    # "jsonObject":Lorg/json/JSONObject;
a=0;//     .end local v6    # "result":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 1244
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v5=(Conflicted);v7=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1257
a=0;//     .local v0, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1258
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v8=(Conflicted);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 1245
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1247
a=0;//     .end local v0    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1248
a=0;//     .local v0, "e":Lorg/apache/http/client/ClientProtocolException;
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lorg/apache/http/client/ClientProtocolException;);
a=0;//     invoke-virtual {v0}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 1257
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1258
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     :cond_2
a=0;//     #v8=(Conflicted);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 1249
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1250
a=0;//     .end local v0    # "e":Lorg/apache/http/client/ClientProtocolException;
a=0;//     :catch_2
a=0;//     #v0=(Uninit);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1251
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 1257
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1258
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     :cond_3
a=0;//     #v8=(Conflicted);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 1252
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1253
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catch_3
a=0;//     #v0=(Uninit);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1254
a=0;//     .local v0, "e":Lorg/json/JSONException;
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 1257
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 1258
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     :cond_4
a=0;//     #v8=(Conflicted);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 1255
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1256
a=0;//     .end local v0    # "e":Lorg/json/JSONException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 1257
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 1258
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     .line 1259
a=0;//     :cond_5
a=0;//     #v8=(Conflicted);
a=0;//     throw v7
a=0;// 
a=0;//     .line 1257
a=0;//     .restart local v4    # "httpResponse":Lorg/apache/http/HttpResponse;
a=0;//     :cond_6
a=0;//     #v0=(Uninit);v4=(Reference,Lorg/apache/http/HttpResponse;);v5=(Uninit);v6=(Uninit);v7=(Null);v8=(Integer);v9=(PosShort);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 1258
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     :cond_7
a=0;//     #v8=(Conflicted);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 1260
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static ParseJsonArray(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONArray;
a=0;//     .locals 10
a=0;//     .param p0, "path"    # Ljava/lang/String;
a=0;//     .param p1, "encode"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v8, 0x2710
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1272
a=0;//     #v7=(Null);
a=0;//     new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     .line 1273
a=0;//     .local v1, "httpClient":Lorg/apache/http/client/HttpClient;
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1274
a=0;//     .local v2, "httpParams":Lorg/apache/http/params/HttpParams;
a=0;//     #v2=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     invoke-static {v2, v8}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 1275
a=0;//     invoke-static {v2, v8}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 1276
a=0;//     new-instance v3, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v3, p0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1278
a=0;//     .local v3, "httpPost":Lorg/apache/http/client/methods/HttpPost;
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-interface {v1, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1279
a=0;//     .local v4, "httpResponse":Lorg/apache/http/HttpResponse;
a=0;//     #v4=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/16 v9, 0xc8
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     if-ne v8, v9, :cond_6
a=0;// 
a=0;//     .line 1280
a=0;//     invoke-interface {v4}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-static {v8, p1}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1281
a=0;//     .local v6, "result":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-direct {v5, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 1298
a=0;//     .local v5, "json":Lorg/json/JSONArray;
a=0;//     #v5=(Reference,Lorg/json/JSONArray;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1299
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v7}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     .line 1301
a=0;//     .end local v4    # "httpResponse":Lorg/apache/http/HttpResponse;
a=0;//     .end local v5    # "json":Lorg/json/JSONArray;
a=0;//     .end local v6    # "result":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 1285
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v5=(Conflicted);v7=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1298
a=0;//     .local v0, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1299
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v8=(Conflicted);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 1286
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1288
a=0;//     .end local v0    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1289
a=0;//     .local v0, "e":Lorg/apache/http/client/ClientProtocolException;
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lorg/apache/http/client/ClientProtocolException;);
a=0;//     invoke-virtual {v0}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 1298
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1299
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     :cond_2
a=0;//     #v8=(Conflicted);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 1290
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1291
a=0;//     .end local v0    # "e":Lorg/apache/http/client/ClientProtocolException;
a=0;//     :catch_2
a=0;//     #v0=(Uninit);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1292
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 1298
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1299
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     :cond_3
a=0;//     #v8=(Conflicted);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 1293
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1294
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :catch_3
a=0;//     #v0=(Uninit);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1295
a=0;//     .local v0, "e":Lorg/json/JSONException;
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 1298
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 1299
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     :cond_4
a=0;//     #v8=(Conflicted);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 1296
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1297
a=0;//     .end local v0    # "e":Lorg/json/JSONException;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 1298
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 1299
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     .line 1300
a=0;//     :cond_5
a=0;//     #v8=(Conflicted);
a=0;//     throw v7
a=0;// 
a=0;//     .line 1298
a=0;//     .restart local v4    # "httpResponse":Lorg/apache/http/HttpResponse;
a=0;//     :cond_6
a=0;//     #v0=(Uninit);v4=(Reference,Lorg/apache/http/HttpResponse;);v5=(Uninit);v6=(Uninit);v7=(Null);v8=(Integer);v9=(PosShort);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 1299
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     :cond_7
a=0;//     #v8=(Conflicted);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 1301
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static ShubenmuluAll(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     .locals 10
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "id"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 554
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 555
a=0;//     .local v5, "v":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 556
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 557
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 558
a=0;//     .local v2, "pt":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/book-index_info_all?articleid=%s&data=json&ct=android&pt=%s&v=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object p1, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     aput-object v2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object v5, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     aput-object v3, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 559
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 560
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 561
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 562
a=0;//     :goto_0
a=0;//     return-object v6
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     invoke-static {v1, v6}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToShubenmulu(Lorg/json/JSONObject;I)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static Shubenxinxiye(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;//     .locals 11
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "id"    # Ljava/lang/String;
a=0;//     .param p2, "source"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 108
a=0;//     .local v6, "v":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 109
a=0;//     .local v4, "srcid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 110
a=0;//     .local v1, "imei":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 111
a=0;//     .local v3, "pt":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 112
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "http://app.2cloo.com/book-one_book?articleid=%s&source=%s&data=json&v=%s&srcid=%s&imei=%s&pt=%s&ct=%s"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x7
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     aput-object p1, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     aput-object p2, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     aput-object v6, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x3
a=0;// 
a=0;//     aput-object v4, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     aput-object v1, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x5
a=0;// 
a=0;//     aput-object v3, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x6
a=0;// 
a=0;//     aput-object v0, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 114
a=0;//     .local v5, "url":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 115
a=0;//     .local v2, "json":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 116
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 117
a=0;//     :goto_0
a=0;//     return-object v7
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToShubenxinxiye(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static ShubenxinxiyeService(Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;//     .locals 10
a=0;//     .param p0, "id"    # Ljava/lang/String;
a=0;//     .param p1, "source"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 125
a=0;//     .local v6, "v":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 126
a=0;//     .local v4, "srcid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 127
a=0;//     .local v1, "imei":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 128
a=0;//     .local v3, "pt":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 129
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "http://app.2cloo.com/book-one_book?articleid=%s&source=%s&data=json&v=%s&srcid=%s&imei=%s&pt=%s&ct=%s"
a=0;// 
a=0;//     const/4 v8, 0x7
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object p0, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     aput-object p1, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object v6, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     aput-object v4, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     aput-object v1, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     aput-object v3, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x6
a=0;// 
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 130
a=0;//     .local v5, "url":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 131
a=0;//     .local v2, "json":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 133
a=0;//     :goto_0
a=0;//     return-object v7
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToShubenxinxiye(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static Shupinginfo(Landroid/app/Activity;Ljava/lang/String;III)Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;//     .locals 10
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "id"    # Ljava/lang/String;
a=0;//     .param p2, "page"    # I
a=0;//     .param p3, "size"    # I
a=0;//     .param p4, "type"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1157
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v5}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1158
a=0;//     .local v2, "pt":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1159
a=0;//     .local v4, "v":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sget v6, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1160
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1161
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     if-ne p4, v5, :cond_0
a=0;// 
a=0;//     .line 1162
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "http://app.2cloo.com/book-shuping?is_top=1&articleid=%s&ct=android&data=json&page=%s&size=%s&pt=%s&v=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x7
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     aput-object p1, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     aput-object v2, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     aput-object v4, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     aput-object v0, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x6
a=0;// 
a=0;//     aput-object v3, v7, v8
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sput-object v5, Lcom/twocloo/com/cn/http/HttpImpl;->url:Ljava/lang/String;
a=0;// 
a=0;//     .line 1166
a=0;//     :goto_0
a=0;//     sget-object v5, Lcom/twocloo/com/cn/http/HttpImpl;->url:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1167
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1168
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1169
a=0;//     :goto_1
a=0;//     return-object v5
a=0;// 
a=0;//     .line 1164
a=0;//     .end local v1    # "json":Lorg/json/JSONObject;
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v5=(One);v6=(Integer);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "http://app.2cloo.com/book-shuping?is_top=1&articleid=%s&ct=android&data=json&page=%s&size=%s&pt=%s&v=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x7
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     aput-object p1, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     aput-object v2, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     aput-object v4, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     aput-object v0, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x6
a=0;// 
a=0;//     aput-object v3, v7, v8
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     sput-object v5, Lcom/twocloo/com/cn/http/HttpImpl;->url:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1169
a=0;//     .restart local v1    # "json":Lorg/json/JSONObject;
a=0;//     :cond_1
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToShupinginfo(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static Subed_chapters_info(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;//     .locals 10
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;//     .param p2, "uid"    # Ljava/lang/String;
a=0;//     .param p3, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 933
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 934
a=0;//     .local v5, "v":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 935
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 936
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 938
a=0;//     .local v2, "pt":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/book-get_subed_chapters_info?articleid=%s&uid=%s&data=json&ct=android&token=%s&pt=%s&v=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x7
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object p1, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     aput-object p2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object p3, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     aput-object v2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     aput-object v5, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x6
a=0;// 
a=0;//     aput-object v3, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 939
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 938
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 940
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 941
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 942
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 946
a=0;//     :goto_0
a=0;//     return-object v6
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToSubedchaptersinfo(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static aboutMe()Lcom/twocloo/com/cn/beans/CallQQ;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 509
a=0;//     const-string v1, "http://app.2cloo.com/client-help_info?"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServerWithCache(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 511
a=0;//     .local v0, "json":Lorg/json/JSONObject;
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 512
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 514
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToAboutme(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/CallQQ;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static alipayApp(Ljava/lang/String;D)Lcom/twocloo/com/cn/beans/AliPayBean;
a=0;//     .locals 11
a=0;//     .param p0, "uid"    # Ljava/lang/String;
a=0;//     .param p1, "money"    # D
a=0;// 
a=0;//     .prologue
a=0;//     .line 1003
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1004
a=0;//     .local v1, "apptype":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1005
a=0;//     .local v4, "srcid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/utils/CommonUtils;->getAppVersionCode(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1006
a=0;//     .local v6, "v":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "android"
a=0;// 
a=0;//     .line 1007
a=0;//     .local v2, "ct":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "http://app.2cloo.com/alipay-alipay_pay&uid=%s&total_fee=%s&pt=%s&gid=1&srcid=%s&v=%s&ct=%s"
a=0;// 
a=0;//     const/4 v8, 0x6
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object p0, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Double;);
a=0;//     aput-object v10, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object v1, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     aput-object v4, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     aput-object v6, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     aput-object v2, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1009
a=0;//     .local v5, "url":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1011
a=0;//     .local v3, "json":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 1012
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1016
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/AliPayBean;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1014
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-class v8, Lcom/twocloo/com/cn/beans/AliPayBean;
a=0;// 
a=0;//     invoke-static {v7, v8}, Lcom/twocloo/base/util/JsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/AliPayBean;
a=0;// 
a=0;//     .line 1016
a=0;//     .local v0, "aliPayBean":Lcom/twocloo/com/cn/beans/AliPayBean;
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static banbenxinxi(Landroid/content/Context;)Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;//     .locals 10
a=0;//     .param p0, "act"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 521
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 522
a=0;//     .local v5, "versionCode":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 523
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 524
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 525
a=0;//     .local v2, "pt":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/ver11-get_newest_version?appid=a03&data=json&ct=android&v=%s&pt=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object v5, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     aput-object v2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     aput-object v3, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 526
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 527
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 528
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 529
a=0;//     :goto_0
a=0;//     return-object v6
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToBanbenxinxi(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static checkBFBook(Landroid/app/Activity;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 11
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 855
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 856
a=0;//     .local v6, "v":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 857
a=0;//     .local v4, "srcid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 858
a=0;//     .local v1, "imei":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 859
a=0;//     .local v3, "pt":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 860
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "http://app.2cloo.com/book-one_book?articleid=%s&source=%s&data=json&v=%s&srcid=%s&imei=%s&pt=%s&ct=%s"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x7
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     aput-object p1, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     aput-object v6, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x3
a=0;// 
a=0;//     aput-object v4, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     aput-object v1, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x5
a=0;// 
a=0;//     aput-object v3, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x6
a=0;// 
a=0;//     aput-object v0, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 861
a=0;//     .local v5, "url":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 862
a=0;//     .local v2, "json":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 863
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 865
a=0;//     .end local v2    # "json":Lorg/json/JSONObject;
a=0;//     :cond_0
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static danbenxinxi(Landroid/content/Context;)Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;//     .locals 11
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 536
a=0;//     new-instance v4, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     move-object v7, p0
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     check-cast v7, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-direct {v4, v7}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 537
a=0;//     .local v4, "phone":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->insertbookid:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 538
a=0;//     .local v0, "aid":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/common/PhoneInfo;->getCurrentVersion()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 539
a=0;//     .local v6, "versioncode":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 540
a=0;//     .local v2, "fromchannel":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 541
a=0;//     .local v1, "area":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "http://app.2cloo.com/ver-single_book_get_newest_version?articleid=%s&versioncode=%s&from_channel=%s&area=%s"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     aput-object v0, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     aput-object v6, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     aput-object v2, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x3
a=0;// 
a=0;//     aput-object v1, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 542
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     check-cast p0, Landroid/app/Activity;
a=0;// 
a=0;//     .end local p0    # "ctx":Landroid/content/Context;
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 541
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 543
a=0;//     .local v5, "url":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 544
a=0;//     .local v3, "json":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 545
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 547
a=0;//     :goto_0
a=0;//     return-object v7
a=0;// 
a=0;//     .line 546
a=0;//     :cond_0
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "\u6267\u884c\u5355\u672c\u7248\u672c\u66f4\u65b0|"
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 547
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToBanbenxinxi(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized downBook(Landroid/app/Activity;Lcom/twocloo/com/cn/http/DownFile;Lcom/twocloo/com/cn/beans/Shubenmulu;Z)V
a=0;//     .locals 43
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "downFile"    # Lcom/twocloo/com/cn/http/DownFile;
a=0;//     .param p2, "mul"    # Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     .param p3, "isDownAll"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 575
a=0;//     const-class v38, Lcom/twocloo/com/cn/http/HttpImpl;
a=0;// 
a=0;//     #v38=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v38
a=0;// 
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     .line 576
a=0;//     .local v31, "u":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v31=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v33
a=0;// 
a=0;//     .line 577
a=0;//     .local v33, "v":Ljava/lang/String;
a=0;//     #v33=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     #v37=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual/range {v37 .. v37}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     sget v39, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v39=(Integer);
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     move/from16 v1, v39
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v30
a=0;// 
a=0;//     .line 578
a=0;//     .local v30, "srcid":Ljava/lang/String;
a=0;//     #v30=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     invoke-static/range {v37 .. v37}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     .line 579
a=0;//     .local v20, "imei":Ljava/lang/String;
a=0;//     #v20=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     invoke-virtual/range {v37 .. v37}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     sget v39, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move/from16 v1, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v28
a=0;// 
a=0;//     .line 580
a=0;//     .local v28, "pt":Ljava/lang/String;
a=0;//     #v28=(Reference,Ljava/lang/String;);
a=0;//     if-eqz p3, :cond_4
a=0;// 
a=0;//     .line 581
a=0;//     new-instance v37, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v37=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v39, "http://app.2cloo.com/book-download?articleid=%s&data=json&ct=android&pt=%s&v=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     #v39=(Reference,Ljava/lang/String;);
a=0;//     const/16 v40, 0x5
a=0;// 
a=0;//     #v40=(PosByte);
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,[Ljava/lang/Object;);
a=0;//     const/16 v41, 0x0
a=0;// 
a=0;//     #v41=(Null);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     #v42=(Reference,Ljava/lang/String;);
a=0;//     aput-object v42, v40, v41
a=0;// 
a=0;//     const/16 v41, 0x1
a=0;// 
a=0;//     #v41=(One);
a=0;//     aput-object v28, v40, v41
a=0;// 
a=0;//     const/16 v41, 0x2
a=0;// 
a=0;//     #v41=(PosByte);
a=0;//     aput-object v33, v40, v41
a=0;// 
a=0;//     const/16 v41, 0x3
a=0;// 
a=0;//     aput-object v20, v40, v41
a=0;// 
a=0;//     const/16 v41, 0x4
a=0;// 
a=0;//     aput-object v30, v40, v41
a=0;// 
a=0;//     invoke-static/range {v39 .. v40}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     invoke-static/range {v39 .. v39}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v37=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v39, "&token="
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/http/DownFile;->token:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v39, v0
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     .line 582
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     .line 581
a=0;//     invoke-virtual/range {v37 .. v37}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v31
a=0;// 
a=0;//     .line 587
a=0;//     :goto_0
a=0;//     #v31=(Reference,Ljava/lang/String;);
a=0;//     new-instance v37, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v37=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v39, "book_text_"
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v37=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v39, v0
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     const-string v39, ".txt"
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     invoke-virtual/range {v37 .. v37}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 589
a=0;//     .local v14, "filename":Ljava/lang/String;
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v32, Ljava/net/URL;
a=0;// 
a=0;//     #v32=(UninitRef,Ljava/net/URL;);
a=0;//     move-object/from16 v0, v32
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     move-object/from16 v1, v31
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 590
a=0;//     .local v32, "url":Ljava/net/URL;
a=0;//     #v0=(Reference,Ljava/net/URL;);v32=(Reference,Ljava/net/URL;);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     .line 591
a=0;//     .local v21, "ins":Ljava/io/InputStream;
a=0;//     #v21=(Null);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 592
a=0;//     .local v16, "fout":Ljava/io/FileOutputStream;
a=0;//     #v16=(Null);
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     .line 593
a=0;//     .local v18, "httpCon":Ljava/net/HttpURLConnection;
a=0;//     #v18=(Null);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .line 596
a=0;//     .local v12, "f":Ljava/io/File;
a=0;//     :try_start_1
a=0;//     #v12=(Null);
a=0;//     invoke-virtual/range {v32 .. v32}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     .line 597
a=0;//     #v18=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     const-string v37, "Content-Type"
a=0;// 
a=0;//     const-string v39, "text/plain"
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v37
a=0;// 
a=0;//     move-object/from16 v2, v39
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 598
a=0;//     const-string v37, "charset"
a=0;// 
a=0;//     const-string v39, "utf-8"
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v37
a=0;// 
a=0;//     move-object/from16 v2, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 599
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->getContentLength()I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     #v37=(Integer);
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v39, v0
a=0;// 
a=0;//     #v39=(LongLo);v40=(LongHi);
a=0;//     move-wide/from16 v0, v39
a=0;// 
a=0;//     move-object/from16 v2, p1
a=0;// 
a=0;//     iput-wide v0, v2, Lcom/twocloo/com/cn/http/DownFile;->fileLen:J
a=0;// 
a=0;//     .line 600
a=0;//     new-instance v13, Ljava/io/File;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v37, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v37=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v39, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_BOOK:Ljava/lang/String;
a=0;// 
a=0;//     #v39=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v39 .. v39}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v37=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v39, "/"
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v39, v0
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     invoke-virtual/range {v37 .. v37}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     new-instance v39, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v39=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v40, "temp"
a=0;// 
a=0;//     #v40=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v39 .. v40}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v39=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v39
a=0;// 
a=0;//     invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     invoke-virtual/range {v39 .. v39}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-direct {v13, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_3
a=0;// 
a=0;//     .line 601
a=0;//     .end local v12    # "f":Ljava/io/File;
a=0;//     .local v13, "f":Ljava/io/File;
a=0;//     :try_start_2
a=0;//     #v13=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v13}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     invoke-virtual/range {v37 .. v37}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 602
a=0;//     invoke-virtual {v13}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     #v37=(Boolean);
a=0;//     if-eqz v37, :cond_0
a=0;// 
a=0;//     .line 603
a=0;//     invoke-virtual {v13}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 605
a=0;//     :cond_0
a=0;//     invoke-virtual {v13}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     .line 606
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     .line 607
a=0;//     #v21=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v21, :cond_8
a=0;// 
a=0;//     .line 608
a=0;//     const-string v37, "\u83b7\u53d6\u4e0d\u5230\u670d\u52a1\u5668\u4fe1\u606f  ----------"
a=0;// 
a=0;//     #v37=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v37 .. v37}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 609
a=0;//     const/16 v37, -0x1
a=0;// 
a=0;//     #v37=(Byte);
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     iput v0, v1, Lcom/twocloo/com/cn/http/DownFile;->isOK:I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_6
a=0;// 
a=0;//     .line 633
a=0;//     if-eqz v16, :cond_1
a=0;// 
a=0;//     .line 634
a=0;//     :try_start_3
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 638
a=0;//     :cond_1
a=0;//     if-eqz v21, :cond_2
a=0;// 
a=0;//     .line 639
a=0;//     :try_start_4
a=0;//     invoke-virtual/range {v21 .. v21}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     :cond_2
a=0;//     if-eqz v18, :cond_3
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v11=(Conflicted);
a=0;//     move-object v12, v13
a=0;// 
a=0;//     .line 723
a=0;//     .end local v13    # "f":Ljava/io/File;
a=0;//     .restart local v12    # "f":Ljava/io/File;
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Reference,Ljava/io/File;);v13=(Conflicted);v15=(Conflicted);v16=(Reference,Ljava/io/FileOutputStream;);v17=(Conflicted);v19=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v29=(Conflicted);v34=(Conflicted);v35=(Conflicted);v36=(Conflicted);v37=(Conflicted);v40=(Conflicted);v41=(Conflicted);v42=(Conflicted);
a=0;//     monitor-exit v38
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 585
a=0;//     .end local v12    # "f":Ljava/io/File;
a=0;//     .end local v14    # "filename":Ljava/lang/String;
a=0;//     .end local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     .end local v18    # "httpCon":Ljava/net/HttpURLConnection;
a=0;//     .end local v21    # "ins":Ljava/io/InputStream;
a=0;//     .end local v32    # "url":Ljava/net/URL;
a=0;//     :cond_4
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v29=(Uninit);v31=(Null);v32=(Uninit);v34=(Uninit);v35=(Uninit);v36=(Uninit);v37=(Reference,Landroid/content/res/Resources;);v39=(Integer);v40=(Uninit);v41=(Uninit);v42=(Uninit);
a=0;//     new-instance v37, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v37=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v39, "http://app.2cloo.com/book-download?articleid=%s&data=json&ct=android&pt=%s&v=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     #v39=(Reference,Ljava/lang/String;);
a=0;//     const/16 v40, 0x5
a=0;// 
a=0;//     #v40=(PosByte);
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,[Ljava/lang/Object;);
a=0;//     const/16 v41, 0x0
a=0;// 
a=0;//     #v41=(Null);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     #v42=(Reference,Ljava/lang/String;);
a=0;//     aput-object v42, v40, v41
a=0;// 
a=0;//     const/16 v41, 0x1
a=0;// 
a=0;//     #v41=(One);
a=0;//     aput-object v28, v40, v41
a=0;// 
a=0;//     const/16 v41, 0x2
a=0;// 
a=0;//     #v41=(PosByte);
a=0;//     aput-object v33, v40, v41
a=0;// 
a=0;//     const/16 v41, 0x3
a=0;// 
a=0;//     aput-object v20, v40, v41
a=0;// 
a=0;//     const/16 v41, 0x4
a=0;// 
a=0;//     aput-object v30, v40, v41
a=0;// 
a=0;//     invoke-static/range {v39 .. v40}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     invoke-static/range {v39 .. v39}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v37=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     invoke-virtual/range {v37 .. v37}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     move-result-object v31
a=0;// 
a=0;//     #v31=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 635
a=0;//     .restart local v13    # "f":Ljava/io/File;
a=0;//     .restart local v14    # "filename":Ljava/lang/String;
a=0;//     .restart local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     .restart local v18    # "httpCon":Ljava/net/HttpURLConnection;
a=0;//     .restart local v21    # "ins":Ljava/io/InputStream;
a=0;//     .restart local v32    # "url":Ljava/net/URL;
a=0;//     :catch_0
a=0;//     #v0=(Byte);v2=(Reference,Lcom/twocloo/com/cn/http/DownFile;);v12=(Null);v13=(Reference,Ljava/io/File;);v14=(Reference,Ljava/lang/String;);v16=(Null);v18=(Reference,Ljava/net/HttpURLConnection;);v21=(Reference,Ljava/io/InputStream;);v32=(Reference,Ljava/net/URL;);v37=(Byte);
a=0;//     move-exception v11
a=0;// 
a=0;//     .line 636
a=0;//     .local v11, "e":Ljava/lang/Exception;
a=0;//     :try_start_6
a=0;//     #v11=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v11}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     .line 638
a=0;//     if-eqz v21, :cond_5
a=0;// 
a=0;//     .line 639
a=0;//     :try_start_7
a=0;//     invoke-virtual/range {v21 .. v21}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     :cond_5
a=0;//     if-eqz v18, :cond_3
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 575
a=0;//     .end local v11    # "e":Ljava/lang/Exception;
a=0;//     .end local v13    # "f":Ljava/io/File;
a=0;//     .end local v14    # "filename":Ljava/lang/String;
a=0;//     .end local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     .end local v18    # "httpCon":Ljava/net/HttpURLConnection;
a=0;//     .end local v20    # "imei":Ljava/lang/String;
a=0;//     .end local v21    # "ins":Ljava/io/InputStream;
a=0;//     .end local v28    # "pt":Ljava/lang/String;
a=0;//     .end local v30    # "srcid":Ljava/lang/String;
a=0;//     .end local v32    # "url":Ljava/net/URL;
a=0;//     .end local v33    # "v":Ljava/lang/String;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v32=(Conflicted);v33=(Conflicted);v34=(Conflicted);v35=(Conflicted);v36=(Conflicted);v37=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);v42=(Conflicted);
a=0;//     move-exception v37
a=0;// 
a=0;//     #v37=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v38
a=0;// 
a=0;//     throw v37
a=0;// 
a=0;//     .line 637
a=0;//     .restart local v13    # "f":Ljava/io/File;
a=0;//     .restart local v14    # "filename":Ljava/lang/String;
a=0;//     .restart local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     .restart local v18    # "httpCon":Ljava/net/HttpURLConnection;
a=0;//     .restart local v20    # "imei":Ljava/lang/String;
a=0;//     .restart local v21    # "ins":Ljava/io/InputStream;
a=0;//     .restart local v28    # "pt":Ljava/lang/String;
a=0;//     .restart local v30    # "srcid":Ljava/lang/String;
a=0;//     .restart local v32    # "url":Ljava/net/URL;
a=0;//     .restart local v33    # "v":Ljava/lang/String;
a=0;//     :catchall_1
a=0;//     #v0=(Byte);v1=(Reference,Lcom/twocloo/com/cn/http/DownFile;);v2=(Reference,Lcom/twocloo/com/cn/http/DownFile;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v12=(Null);v13=(Reference,Ljava/io/File;);v14=(Reference,Ljava/lang/String;);v15=(Uninit);v16=(Null);v17=(Uninit);v18=(Reference,Ljava/net/HttpURLConnection;);v19=(Uninit);v20=(Reference,Ljava/lang/String;);v21=(Reference,Ljava/io/InputStream;);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Reference,Ljava/lang/String;);v29=(Uninit);v30=(Reference,Ljava/lang/String;);v32=(Reference,Ljava/net/URL;);v33=(Reference,Ljava/lang/String;);v34=(Uninit);v35=(Uninit);v36=(Uninit);v37=(Byte);v39=(Reference,Ljava/lang/String;);v40=(Reference,Ljava/lang/String;);v41=(PosByte);v42=(Reference,Ljava/lang/String;);
a=0;//     move-exception v37
a=0;// 
a=0;//     .line 638
a=0;//     #v37=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v21, :cond_6
a=0;// 
a=0;//     .line 639
a=0;//     :try_start_8
a=0;//     invoke-virtual/range {v21 .. v21}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     :cond_6
a=0;//     if-eqz v18, :cond_7
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 642
a=0;//     :cond_7
a=0;//     throw v37
a=0;//     :try_end_8
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_0
a=0;// 
a=0;//     .line 612
a=0;//     :cond_8
a=0;//     :try_start_9
a=0;//     #v0=(Reference,Ljava/lang/String;);v11=(Uninit);v37=(Boolean);
a=0;//     new-instance v17, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v0, v13}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_6
a=0;// 
a=0;//     .line 613
a=0;//     .end local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     .local v17, "fout":Ljava/io/FileOutputStream;
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);v17=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v37, 0x800
a=0;// 
a=0;//     :try_start_a
a=0;//     #v37=(PosShort);
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v5, v0, [B
a=0;// 
a=0;//     .line 614
a=0;//     .local v5, "buf":[B
a=0;//     #v5=(Reference,[B);
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     .line 615
a=0;//     .local v24, "nnumber":I
a=0;//     #v24=(Null);
a=0;//     const/16 v37, 0x0
a=0;// 
a=0;//     #v37=(Null);
a=0;//     array-length v0, v5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v39, v0
a=0;// 
a=0;//     #v39=(Integer);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     move/from16 v1, v37
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move/from16 v2, v39
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v5, v1, v2}, Ljava/io/InputStream;->read([BII)I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     .line 616
a=0;//     :goto_3
a=0;//     #v24=(Integer);v40=(Conflicted);v41=(Conflicted);v42=(Conflicted);
a=0;//     const/16 v37, -0x1
a=0;// 
a=0;//     #v37=(Byte);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v37
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_13
a=0;// 
a=0;//     .line 624
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     iget-wide v0, v0, Lcom/twocloo/com/cn/http/DownFile;->downLen:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v39, v0
a=0;// 
a=0;//     #v39=(LongLo);v40=(LongHi);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     iget-wide v0, v0, Lcom/twocloo/com/cn/http/DownFile;->fileLen:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     move-wide/from16 v41, v0
a=0;// 
a=0;//     #v41=(LongLo);v42=(LongHi);
a=0;//     cmp-long v37, v39, v41
a=0;// 
a=0;//     if-nez v37, :cond_9
a=0;// 
a=0;//     .line 625
a=0;//     const/16 v37, 0x1
a=0;// 
a=0;//     #v37=(One);
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     iput v0, v1, Lcom/twocloo/com/cn/http/DownFile;->isOK:I
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_7
a=0;// 
a=0;//     .line 633
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v1=(Conflicted);v37=(Byte);
a=0;//     if-eqz v17, :cond_a
a=0;// 
a=0;//     .line 634
a=0;//     :try_start_b
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4
a=0;//     .catchall {:try_start_b .. :try_end_b} :catchall_5
a=0;// 
a=0;//     .line 638
a=0;//     :cond_a
a=0;//     if-eqz v21, :cond_b
a=0;// 
a=0;//     .line 639
a=0;//     :try_start_c
a=0;//     invoke-virtual/range {v21 .. v21}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     :cond_b
a=0;//     if-eqz v18, :cond_c
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     :cond_c
a=0;//     #v11=(Conflicted);
a=0;//     move-object v12, v13
a=0;// 
a=0;//     .end local v13    # "f":Ljava/io/File;
a=0;//     .restart local v12    # "f":Ljava/io/File;
a=0;//     #v12=(Reference,Ljava/io/File;);
a=0;//     move-object/from16 v16, v17
a=0;// 
a=0;//     .line 645
a=0;//     .end local v5    # "buf":[B
a=0;//     .end local v17    # "fout":Ljava/io/FileOutputStream;
a=0;//     .end local v24    # "nnumber":I
a=0;//     .restart local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     :cond_d
a=0;//     :goto_4
a=0;//     #v2=(Conflicted);v5=(Conflicted);v13=(Conflicted);v16=(Reference,Ljava/io/FileOutputStream;);v17=(Conflicted);v24=(Conflicted);v37=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);v42=(Conflicted);
a=0;//     if-eqz p2, :cond_12
a=0;// 
a=0;//     .line 646
a=0;//     new-instance v27, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v27=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 647
a=0;//     .local v27, "plist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v22, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct/range {v22 .. v22}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 648
a=0;//     .local v22, "jjlist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     #v22=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v4, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v37, Ljava/io/FileReader;
a=0;// 
a=0;//     #v37=(UninitRef,Ljava/io/FileReader;);
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileReader;);
a=0;//     invoke-direct {v0, v12}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileReader;);v37=(Reference,Ljava/io/FileReader;);
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     invoke-direct {v4, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 649
a=0;//     .local v4, "br":Ljava/io/BufferedReader;
a=0;//     #v4=(Reference,Ljava/io/BufferedReader;);
a=0;//     new-instance v15, Ljava/io/File;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v37, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v37=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v39, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_BOOK:Ljava/lang/String;
a=0;// 
a=0;//     #v39=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v39 .. v39}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v37=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v39, "/"
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v39, v0
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     invoke-virtual/range {v37 .. v37}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     invoke-direct {v15, v0, v14}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 650
a=0;//     .local v15, "finish":Ljava/io/File;
a=0;//     #v15=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v15}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     iput-object v0, v1, Lcom/twocloo/com/cn/http/DownFile;->filelocation:Ljava/lang/String;
a=0;// 
a=0;//     .line 651
a=0;//     new-instance v25, Ljava/io/PrintWriter;
a=0;// 
a=0;//     #v25=(UninitRef,Ljava/io/PrintWriter;);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/PrintWriter;);
a=0;//     invoke-direct {v0, v15}, Ljava/io/PrintWriter;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 652
a=0;//     .local v25, "out":Ljava/io/PrintWriter;
a=0;//     #v0=(Reference,Ljava/io/PrintWriter;);v25=(Reference,Ljava/io/PrintWriter;);
a=0;//     invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v29
a=0;// 
a=0;//     .line 653
a=0;//     .local v29, "s":Ljava/lang/String;
a=0;//     #v29=(Reference,Ljava/lang/String;);
a=0;//     const/16 v26, 0x0
a=0;// 
a=0;//     .line 654
a=0;//     .local v26, "p":I
a=0;//     #v26=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 655
a=0;//     .local v6, "buff":Ljava/lang/StringBuffer;
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v6=(Reference,Ljava/lang/StringBuffer;);v23=(Conflicted);v26=(Integer);v34=(Conflicted);v37=(Conflicted);
a=0;//     if-nez v29, :cond_22
a=0;// 
a=0;//     .line 678
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/io/PrintWriter;->close()V
a=0;// 
a=0;//     .line 679
a=0;//     invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     .line 680
a=0;//     if-eqz v6, :cond_f
a=0;// 
a=0;//     .line 681
a=0;//     const/16 v23, 0x1e
a=0;// 
a=0;//     .line 682
a=0;//     .local v23, "len":I
a=0;//     #v23=(PosByte);
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     #v37=(Integer);
a=0;//     const/16 v39, 0x1e
a=0;// 
a=0;//     #v39=(PosByte);
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v39
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_e
a=0;// 
a=0;//     .line 683
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     .line 684
a=0;//     :cond_e
a=0;//     #v23=(Integer);
a=0;//     new-instance v37, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v37=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     #v39=(Reference,Ljava/lang/String;);
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     #v40=(Null);
a=0;//     move-object/from16 v0, v39
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v1, v40
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move/from16 v2, v23
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     invoke-static/range {v39 .. v39}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v37=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v39, "..."
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     invoke-virtual/range {v37 .. v37}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, v37
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 685
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, v37
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 687
a=0;//     .end local v23    # "len":I
a=0;//     :cond_f
a=0;//     #v0=(Conflicted);v2=(Conflicted);v23=(Conflicted);v37=(Conflicted);v40=(Conflicted);
a=0;//     invoke-virtual/range {p2 .. p2}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 688
a=0;//     .local v9, "clist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     .local v19, "i":I
a=0;//     :goto_6
a=0;//     #v1=(Conflicted);v7=(Conflicted);v8=(Conflicted);v19=(Integer);v35=(Conflicted);v36=(Conflicted);
a=0;//     invoke-virtual {v9}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     #v37=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v37
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_10
a=0;// 
a=0;//     invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v37
a=0;// 
a=0;//     if-lt v0, v1, :cond_27
a=0;// 
a=0;//     .line 702
a=0;//     :cond_10
a=0;//     invoke-virtual {v9}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v39
a=0;// 
a=0;//     #v39=(Integer);
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     move/from16 v1, v39
a=0;// 
a=0;//     if-le v0, v1, :cond_11
a=0;// 
a=0;//     invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     if-lez v37, :cond_11
a=0;// 
a=0;//     .line 703
a=0;//     invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 704
a=0;//     .local v8, "cinfNext":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     add-int/lit8 v37, v37, -0x1
a=0;// 
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 705
a=0;//     .local v7, "cinf":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setNextvip(I)V
a=0;// 
a=0;//     .line 706
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     #v37=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setNextid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 709
a=0;//     .end local v7    # "cinf":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .end local v8    # "cinfNext":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :cond_11
a=0;//     #v0=(Conflicted);v7=(Conflicted);v8=(Conflicted);v37=(Conflicted);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v37, v0
a=0;// 
a=0;//     #v37=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/Util;->write(Ljava/lang/String;Lcom/twocloo/com/cn/beans/Shubenmulu;)V
a=0;// 
a=0;//     .line 712
a=0;//     sget-object v37, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     if-eqz v37, :cond_12
a=0;// 
a=0;//     .line 713
a=0;//     new-instance v10, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v10=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     sget-object v37, Lcom/twocloo/com/cn/common/CloseActivity;->curActivity:Landroid/app/Activity;
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     invoke-direct {v10, v0}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 714
a=0;//     .local v10, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 715
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/http/DownFile;->filelocation:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v37, v0
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v39, v0
a=0;// 
a=0;//     #v39=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p2 .. p2}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getLastuptime()J
a=0;// 
a=0;//     move-result-wide v40
a=0;// 
a=0;//     #v40=(LongLo);v41=(LongHi);
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     move-wide/from16 v2, v40
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v10, v0, v1, v2, v3}, Lcom/twocloo/com/cn/db/DBAdapter;->updateSetBookFile(Ljava/lang/String;Ljava/lang/String;J)J
a=0;// 
a=0;//     .line 716
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v37, v0
a=0;// 
a=0;//     const/16 v39, 0x0
a=0;// 
a=0;//     #v39=(Null);
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     #v40=(Null);
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move/from16 v1, v39
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move/from16 v2, v40
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v10, v0, v1, v2}, Lcom/twocloo/com/cn/db/DBAdapter;->isNeedUp(Ljava/lang/String;II)J
a=0;// 
a=0;//     .line 717
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v37, v0
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/http/DownFile;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-object/from16 v39, v0
a=0;// 
a=0;//     #v39=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     invoke-virtual/range {v39 .. v39}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getLastuptime()J
a=0;// 
a=0;//     move-result-wide v39
a=0;// 
a=0;//     #v39=(LongLo);v40=(LongHi);
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-wide/from16 v1, v39
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v10, v0, v1, v2}, Lcom/twocloo/com/cn/db/DBAdapter;->upLasttime(Ljava/lang/String;J)J
a=0;// 
a=0;//     .line 718
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 721
a=0;//     .end local v4    # "br":Ljava/io/BufferedReader;
a=0;//     .end local v6    # "buff":Ljava/lang/StringBuffer;
a=0;//     .end local v9    # "clist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     .end local v10    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .end local v15    # "finish":Ljava/io/File;
a=0;//     .end local v19    # "i":I
a=0;//     .end local v22    # "jjlist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     .end local v25    # "out":Ljava/io/PrintWriter;
a=0;//     .end local v26    # "p":I
a=0;//     .end local v27    # "plist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
a=0;//     .end local v29    # "s":Ljava/lang/String;
a=0;//     :cond_12
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);v15=(Conflicted);v19=(Conflicted);v22=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v29=(Conflicted);v37=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     sget-object v37, Lcom/twocloo/com/cn/http/DownFile;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v37=(Reference,Landroid/os/Handler;);
a=0;//     const/16 v39, 0x11
a=0;// 
a=0;//     #v39=(PosByte);
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     move/from16 v1, v39
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 722
a=0;//     sget-object v37, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/http/DownFile;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v39, v0
a=0;// 
a=0;//     #v39=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_c
a=0;//     .catchall {:try_start_c .. :try_end_c} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 617
a=0;//     .end local v12    # "f":Ljava/io/File;
a=0;//     .end local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     .restart local v5    # "buf":[B
a=0;//     .restart local v13    # "f":Ljava/io/File;
a=0;//     .restart local v17    # "fout":Ljava/io/FileOutputStream;
a=0;//     .restart local v24    # "nnumber":I
a=0;//     :cond_13
a=0;//     :try_start_d
a=0;//     #v0=(Integer);v1=(Byte);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Reference,[B);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Null);v13=(Reference,Ljava/io/File;);v15=(Uninit);v16=(Null);v17=(Reference,Ljava/io/FileOutputStream;);v19=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Integer);v25=(Uninit);v26=(Uninit);v27=(Uninit);v29=(Uninit);v34=(Uninit);v35=(Uninit);v36=(Uninit);v37=(Byte);v39=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     iget-wide v0, v0, Lcom/twocloo/com/cn/http/DownFile;->downLen:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v39, v0
a=0;// 
a=0;//     #v39=(LongLo);v40=(LongHi);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     move-wide/from16 v41, v0
a=0;// 
a=0;//     #v41=(LongLo);v42=(LongHi);
a=0;//     add-long v39, v39, v41
a=0;// 
a=0;//     move-wide/from16 v0, v39
a=0;// 
a=0;//     move-object/from16 v2, p1
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     iput-wide v0, v2, Lcom/twocloo/com/cn/http/DownFile;->downLen:J
a=0;// 
a=0;//     .line 621
a=0;//     const/16 v37, 0x0
a=0;// 
a=0;//     #v37=(Null);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move/from16 v1, v37
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move/from16 v2, v24
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v5, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
a=0;// 
a=0;//     .line 622
a=0;//     const/16 v37, 0x0
a=0;// 
a=0;//     array-length v0, v5
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v39, v0
a=0;// 
a=0;//     #v39=(Integer);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     move/from16 v1, v37
a=0;// 
a=0;//     move/from16 v2, v39
a=0;// 
a=0;//     invoke-virtual {v0, v5, v1, v2}, Ljava/io/InputStream;->read([BII)I
a=0;//     :try_end_d
a=0;//     .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_6
a=0;//     .catchall {:try_start_d .. :try_end_d} :catchall_7
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 629
a=0;//     .end local v5    # "buf":[B
a=0;//     .end local v13    # "f":Ljava/io/File;
a=0;//     .end local v17    # "fout":Ljava/io/FileOutputStream;
a=0;//     .end local v24    # "nnumber":I
a=0;//     .restart local v12    # "f":Ljava/io/File;
a=0;//     .restart local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Uninit);v13=(Conflicted);v17=(Uninit);v21=(Null);v24=(Uninit);v37=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(PosByte);v42=(Reference,Ljava/lang/String;);
a=0;//     move-exception v11
a=0;// 
a=0;//     .line 630
a=0;//     .restart local v11    # "e":Ljava/lang/Exception;
a=0;//     :goto_7
a=0;//     :try_start_e
a=0;//     #v5=(Conflicted);v11=(Reference,Ljava/lang/Exception;);v12=(Reference,Ljava/io/File;);v16=(Reference,Ljava/io/FileOutputStream;);v17=(Conflicted);v21=(Reference,Ljava/io/InputStream;);v24=(Conflicted);v41=(Conflicted);v42=(Conflicted);
a=0;//     invoke-virtual {v11}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_e
a=0;//     .catchall {:try_start_e .. :try_end_e} :catchall_3
a=0;// 
a=0;//     .line 633
a=0;//     if-eqz v16, :cond_14
a=0;// 
a=0;//     .line 634
a=0;//     :try_start_f
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_f
a=0;//     .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_2
a=0;//     .catchall {:try_start_f .. :try_end_f} :catchall_2
a=0;// 
a=0;//     .line 638
a=0;//     :cond_14
a=0;//     if-eqz v21, :cond_15
a=0;// 
a=0;//     .line 639
a=0;//     :try_start_10
a=0;//     invoke-virtual/range {v21 .. v21}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     :cond_15
a=0;//     if-eqz v18, :cond_d
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;//     :try_end_10
a=0;//     .catchall {:try_start_10 .. :try_end_10} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 635
a=0;//     :catch_2
a=0;//     move-exception v11
a=0;// 
a=0;//     .line 636
a=0;//     :try_start_11
a=0;//     invoke-virtual {v11}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_11
a=0;//     .catchall {:try_start_11 .. :try_end_11} :catchall_2
a=0;// 
a=0;//     .line 638
a=0;//     if-eqz v21, :cond_16
a=0;// 
a=0;//     .line 639
a=0;//     :try_start_12
a=0;//     invoke-virtual/range {v21 .. v21}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     :cond_16
a=0;//     if-eqz v18, :cond_d
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 637
a=0;//     :catchall_2
a=0;//     move-exception v37
a=0;// 
a=0;//     .line 638
a=0;//     #v37=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v21, :cond_17
a=0;// 
a=0;//     .line 639
a=0;//     invoke-virtual/range {v21 .. v21}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     :cond_17
a=0;//     if-eqz v18, :cond_18
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 642
a=0;//     :cond_18
a=0;//     throw v37
a=0;//     :try_end_12
a=0;//     .catchall {:try_start_12 .. :try_end_12} :catchall_0
a=0;// 
a=0;//     .line 631
a=0;//     .end local v11    # "e":Ljava/lang/Exception;
a=0;//     :catchall_3
a=0;//     #v11=(Conflicted);v37=(Conflicted);
a=0;//     move-exception v37
a=0;// 
a=0;//     .line 633
a=0;//     :goto_8
a=0;//     #v37=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v16, :cond_19
a=0;// 
a=0;//     .line 634
a=0;//     :try_start_13
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_13
a=0;//     .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_3
a=0;//     .catchall {:try_start_13 .. :try_end_13} :catchall_4
a=0;// 
a=0;//     .line 638
a=0;//     :cond_19
a=0;//     if-eqz v21, :cond_1a
a=0;// 
a=0;//     .line 639
a=0;//     :try_start_14
a=0;//     invoke-virtual/range {v21 .. v21}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     :cond_1a
a=0;//     if-eqz v18, :cond_1b
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 643
a=0;//     :cond_1b
a=0;//     :goto_9
a=0;//     throw v37
a=0;//     :try_end_14
a=0;//     .catchall {:try_start_14 .. :try_end_14} :catchall_0
a=0;// 
a=0;//     .line 635
a=0;//     :catch_3
a=0;//     move-exception v11
a=0;// 
a=0;//     .line 636
a=0;//     .restart local v11    # "e":Ljava/lang/Exception;
a=0;//     :try_start_15
a=0;//     #v11=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v11}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_15
a=0;//     .catchall {:try_start_15 .. :try_end_15} :catchall_4
a=0;// 
a=0;//     .line 638
a=0;//     if-eqz v21, :cond_1c
a=0;// 
a=0;//     .line 639
a=0;//     :try_start_16
a=0;//     invoke-virtual/range {v21 .. v21}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     :cond_1c
a=0;//     if-eqz v18, :cond_1b
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 637
a=0;//     .end local v11    # "e":Ljava/lang/Exception;
a=0;//     :catchall_4
a=0;//     #v11=(Conflicted);
a=0;//     move-exception v37
a=0;// 
a=0;//     .line 638
a=0;//     if-eqz v21, :cond_1d
a=0;// 
a=0;//     .line 639
a=0;//     invoke-virtual/range {v21 .. v21}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     :cond_1d
a=0;//     if-eqz v18, :cond_1e
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 642
a=0;//     :cond_1e
a=0;//     throw v37
a=0;//     :try_end_16
a=0;//     .catchall {:try_start_16 .. :try_end_16} :catchall_0
a=0;// 
a=0;//     .line 635
a=0;//     .end local v12    # "f":Ljava/io/File;
a=0;//     .end local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     .restart local v5    # "buf":[B
a=0;//     .restart local v13    # "f":Ljava/io/File;
a=0;//     .restart local v17    # "fout":Ljava/io/FileOutputStream;
a=0;//     .restart local v24    # "nnumber":I
a=0;//     :catch_4
a=0;//     #v2=(Integer);v5=(Reference,[B);v11=(Uninit);v12=(Null);v13=(Reference,Ljava/io/File;);v16=(Null);v17=(Reference,Ljava/io/FileOutputStream;);v24=(Integer);v37=(Byte);v39=(LongLo);v40=(LongHi);v41=(LongLo);v42=(LongHi);
a=0;//     move-exception v11
a=0;// 
a=0;//     .line 636
a=0;//     .restart local v11    # "e":Ljava/lang/Exception;
a=0;//     :try_start_17
a=0;//     #v11=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v11}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_17
a=0;//     .catchall {:try_start_17 .. :try_end_17} :catchall_5
a=0;// 
a=0;//     .line 638
a=0;//     if-eqz v21, :cond_1f
a=0;// 
a=0;//     .line 639
a=0;//     :try_start_18
a=0;//     invoke-virtual/range {v21 .. v21}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     :cond_1f
a=0;//     if-eqz v18, :cond_c
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     move-object v12, v13
a=0;// 
a=0;//     .end local v13    # "f":Ljava/io/File;
a=0;//     .restart local v12    # "f":Ljava/io/File;
a=0;//     #v12=(Reference,Ljava/io/File;);
a=0;//     move-object/from16 v16, v17
a=0;// 
a=0;//     .end local v17    # "fout":Ljava/io/FileOutputStream;
a=0;//     .restart local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     #v16=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 637
a=0;//     .end local v11    # "e":Ljava/lang/Exception;
a=0;//     .end local v12    # "f":Ljava/io/File;
a=0;//     .end local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     .restart local v13    # "f":Ljava/io/File;
a=0;//     .restart local v17    # "fout":Ljava/io/FileOutputStream;
a=0;//     :catchall_5
a=0;//     #v11=(Conflicted);v12=(Null);v16=(Null);
a=0;//     move-exception v37
a=0;// 
a=0;//     .line 638
a=0;//     #v37=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v21, :cond_20
a=0;// 
a=0;//     .line 639
a=0;//     invoke-virtual/range {v21 .. v21}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 640
a=0;//     :cond_20
a=0;//     if-eqz v18, :cond_21
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 642
a=0;//     :cond_21
a=0;//     throw v37
a=0;// 
a=0;//     .line 656
a=0;//     .end local v5    # "buf":[B
a=0;//     .end local v13    # "f":Ljava/io/File;
a=0;//     .end local v17    # "fout":Ljava/io/FileOutputStream;
a=0;//     .end local v24    # "nnumber":I
a=0;//     .restart local v4    # "br":Ljava/io/BufferedReader;
a=0;//     .restart local v6    # "buff":Ljava/lang/StringBuffer;
a=0;//     .restart local v12    # "f":Ljava/io/File;
a=0;//     .restart local v15    # "finish":Ljava/io/File;
a=0;//     .restart local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     .restart local v22    # "jjlist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     .restart local v25    # "out":Ljava/io/PrintWriter;
a=0;//     .restart local v26    # "p":I
a=0;//     .restart local v27    # "plist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
a=0;//     .restart local v29    # "s":Ljava/lang/String;
a=0;//     :cond_22
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);v4=(Reference,Ljava/io/BufferedReader;);v5=(Conflicted);v6=(Reference,Ljava/lang/StringBuffer;);v12=(Reference,Ljava/io/File;);v13=(Conflicted);v15=(Reference,Ljava/io/File;);v16=(Reference,Ljava/io/FileOutputStream;);v17=(Conflicted);v22=(Reference,Ljava/util/ArrayList;);v23=(Conflicted);v24=(Conflicted);v25=(Reference,Ljava/io/PrintWriter;);v26=(Integer);v27=(Reference,Ljava/util/ArrayList;);v29=(Reference,Ljava/lang/String;);v34=(Conflicted);v37=(Conflicted);v39=(Reference,Ljava/lang/String;);v40=(Conflicted);v41=(Conflicted);v42=(Conflicted);
a=0;//     const-string v37, "#nan#wu#ou#ni#tou#fo###"
a=0;// 
a=0;//     #v37=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v29
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v1, v37
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v34
a=0;// 
a=0;//     .line 657
a=0;//     .local v34, "w":I
a=0;//     #v34=(Integer);
a=0;//     const/16 v37, -0x1
a=0;// 
a=0;//     #v37=(Byte);
a=0;//     move/from16 v0, v34
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v37
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_26
a=0;// 
a=0;//     .line 658
a=0;//     const-string v37, "#nan#wu#ou#ni#tou#fo###"
a=0;// 
a=0;//     #v37=(Reference,Ljava/lang/String;);
a=0;//     const-string v39, ""
a=0;// 
a=0;//     move-object/from16 v0, v29
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v1, v37
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v2, v39
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v29
a=0;// 
a=0;//     .line 659
a=0;//     add-int v37, v26, v34
a=0;// 
a=0;//     #v37=(Integer);
a=0;//     invoke-static/range {v37 .. v37}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     #v37=(Reference,Ljava/lang/Integer;);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move-object/from16 v1, v37
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 660
a=0;//     if-nez v6, :cond_24
a=0;// 
a=0;//     .line 661
a=0;//     new-instance v6, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .end local v6    # "buff":Ljava/lang/StringBuffer;
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 673
a=0;//     .restart local v6    # "buff":Ljava/lang/StringBuffer;
a=0;//     :cond_23
a=0;//     :goto_a
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v6=(Reference,Ljava/lang/StringBuffer;);v37=(Conflicted);v39=(Conflicted);
a=0;//     new-instance v37, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v37=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {v29 .. v29}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     #v39=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v37=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v39, "\n"
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     invoke-virtual/range {v37 .. v37}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v29
a=0;// 
a=0;//     .line 674
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v29
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 675
a=0;//     const-string v37, "utf-8"
a=0;// 
a=0;//     move-object/from16 v0, v29
a=0;// 
a=0;//     move-object/from16 v1, v37
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v37, v0
a=0;// 
a=0;//     #v37=(Integer);
a=0;//     add-int v26, v26, v37
a=0;// 
a=0;//     .line 676
a=0;//     invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v29
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 663
a=0;//     :cond_24
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v2=(Reference,Ljava/lang/String;);v37=(Reference,Ljava/lang/Integer;);
a=0;//     const/16 v23, 0x1e
a=0;// 
a=0;//     .line 664
a=0;//     .restart local v23    # "len":I
a=0;//     #v23=(PosByte);
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     #v37=(Integer);
a=0;//     const/16 v39, 0x1e
a=0;// 
a=0;//     #v39=(PosByte);
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v39
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_25
a=0;// 
a=0;//     .line 665
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     .line 666
a=0;//     :cond_25
a=0;//     #v23=(Integer);
a=0;//     new-instance v37, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v37=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     #v39=(Reference,Ljava/lang/String;);
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     #v40=(Null);
a=0;//     move-object/from16 v0, v39
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v1, v40
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move/from16 v2, v23
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     invoke-static/range {v39 .. v39}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v39
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);v37=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v39, "..."
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     move-object/from16 v1, v39
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     invoke-virtual/range {v37 .. v37}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, v37
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 667
a=0;//     new-instance v6, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .end local v6    # "buff":Ljava/lang/StringBuffer;
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 669
a=0;//     .restart local v6    # "buff":Ljava/lang/StringBuffer;
a=0;//     #v6=(Reference,Ljava/lang/StringBuffer;);
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     .line 670
a=0;//     .end local v23    # "len":I
a=0;//     :cond_26
a=0;//     #v0=(Integer);v1=(Byte);v2=(Conflicted);v23=(Conflicted);v37=(Byte);v40=(Conflicted);
a=0;//     if-eqz v6, :cond_23
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     #v37=(Integer);
a=0;//     const/16 v39, 0x1e
a=0;// 
a=0;//     #v39=(PosByte);
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     move/from16 v1, v39
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_23
a=0;// 
a=0;//     .line 671
a=0;//     move-object/from16 v0, v29
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     .line 689
a=0;//     .end local v34    # "w":I
a=0;//     .restart local v9    # "clist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     .restart local v19    # "i":I
a=0;//     :cond_27
a=0;//     #v0=(Integer);v1=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Reference,Ljava/util/ArrayList;);v19=(Integer);v34=(Conflicted);v35=(Conflicted);v36=(Conflicted);v39=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 690
a=0;//     .restart local v7    # "cinf":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     #v37=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v37, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual/range {v37 .. v37}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v35
a=0;// 
a=0;//     .line 691
a=0;//     .local v35, "x":I
a=0;//     #v35=(Integer);
a=0;//     move/from16 v36, v26
a=0;// 
a=0;//     .line 692
a=0;//     .local v36, "y":I
a=0;//     #v36=(Integer);
a=0;//     invoke-virtual {v9}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     #v37=(Integer);
a=0;//     add-int/lit8 v37, v37, -0x1
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v37
a=0;// 
a=0;//     if-ge v0, v1, :cond_28
a=0;// 
a=0;//     invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     add-int/lit8 v37, v37, -0x1
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v37
a=0;// 
a=0;//     if-ge v0, v1, :cond_28
a=0;// 
a=0;//     .line 693
a=0;//     add-int/lit8 v37, v19, 0x1
a=0;// 
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     move/from16 v1, v37
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     #v37=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v37, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual/range {v37 .. v37}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v36
a=0;// 
a=0;//     .line 694
a=0;//     add-int/lit8 v37, v19, 0x1
a=0;// 
a=0;//     #v37=(Integer);
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v9, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 695
a=0;//     .restart local v8    # "cinfNext":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     #v37=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setNextid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 696
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setPreid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 698
a=0;//     .end local v8    # "cinfNext":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :cond_28
a=0;//     #v0=(Conflicted);v8=(Conflicted);v37=(Conflicted);
a=0;//     move/from16 v0, v35
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v7, v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setPosi(I)V
a=0;// 
a=0;//     .line 699
a=0;//     sub-int v37, v36, v35
a=0;// 
a=0;//     #v37=(Integer);
a=0;//     move/from16 v0, v37
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setLen(I)V
a=0;// 
a=0;//     .line 700
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v37
a=0;// 
a=0;//     #v37=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v37, Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v37
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setTextjj(Ljava/lang/String;)V
a=0;//     :try_end_18
a=0;//     .catchall {:try_start_18 .. :try_end_18} :catchall_0
a=0;// 
a=0;//     .line 688
a=0;//     add-int/lit8 v19, v19, 0x1
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 631
a=0;//     .end local v4    # "br":Ljava/io/BufferedReader;
a=0;//     .end local v6    # "buff":Ljava/lang/StringBuffer;
a=0;//     .end local v7    # "cinf":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .end local v9    # "clist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     .end local v12    # "f":Ljava/io/File;
a=0;//     .end local v15    # "finish":Ljava/io/File;
a=0;//     .end local v19    # "i":I
a=0;//     .end local v22    # "jjlist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     .end local v25    # "out":Ljava/io/PrintWriter;
a=0;//     .end local v26    # "p":I
a=0;//     .end local v27    # "plist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
a=0;//     .end local v29    # "s":Ljava/lang/String;
a=0;//     .end local v35    # "x":I
a=0;//     .end local v36    # "y":I
a=0;//     .restart local v13    # "f":Ljava/io/File;
a=0;//     :catchall_6
a=0;//     #v0=(Conflicted);v1=(Reference,Ujava/lang/Object;);v2=(Reference,Lcom/twocloo/com/cn/http/DownFile;);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Null);v13=(Reference,Ljava/io/File;);v15=(Uninit);v16=(Null);v19=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v29=(Uninit);v34=(Uninit);v35=(Uninit);v36=(Uninit);v37=(Conflicted);v40=(Reference,Ljava/lang/String;);v41=(PosByte);v42=(Reference,Ljava/lang/String;);
a=0;//     move-exception v37
a=0;// 
a=0;//     #v37=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v12, v13
a=0;// 
a=0;//     .end local v13    # "f":Ljava/io/File;
a=0;//     .restart local v12    # "f":Ljava/io/File;
a=0;//     #v12=(Reference,Ljava/io/File;);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .end local v12    # "f":Ljava/io/File;
a=0;//     .end local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     .restart local v13    # "f":Ljava/io/File;
a=0;//     .restart local v17    # "fout":Ljava/io/FileOutputStream;
a=0;//     :catchall_7
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v12=(Null);v17=(Reference,Ljava/io/FileOutputStream;);v24=(Conflicted);v37=(Short);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);v42=(Conflicted);
a=0;//     move-exception v37
a=0;// 
a=0;//     #v37=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v12, v13
a=0;// 
a=0;//     .end local v13    # "f":Ljava/io/File;
a=0;//     .restart local v12    # "f":Ljava/io/File;
a=0;//     #v12=(Reference,Ljava/io/File;);
a=0;//     move-object/from16 v16, v17
a=0;// 
a=0;//     .end local v17    # "fout":Ljava/io/FileOutputStream;
a=0;//     .restart local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     #v16=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 629
a=0;//     .end local v12    # "f":Ljava/io/File;
a=0;//     .restart local v13    # "f":Ljava/io/File;
a=0;//     :catch_5
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Reference,Lcom/twocloo/com/cn/http/DownFile;);v5=(Uninit);v12=(Null);v16=(Null);v17=(Conflicted);v24=(Uninit);v37=(Conflicted);v39=(Reference,Ljava/lang/String;);v40=(Reference,Ljava/lang/String;);v41=(PosByte);v42=(Reference,Ljava/lang/String;);
a=0;//     move-exception v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v12, v13
a=0;// 
a=0;//     .end local v13    # "f":Ljava/io/File;
a=0;//     .restart local v12    # "f":Ljava/io/File;
a=0;//     #v12=(Reference,Ljava/io/File;);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .end local v12    # "f":Ljava/io/File;
a=0;//     .end local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     .restart local v13    # "f":Ljava/io/File;
a=0;//     .restart local v17    # "fout":Ljava/io/FileOutputStream;
a=0;//     :catch_6
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v11=(Uninit);v12=(Null);v17=(Reference,Ljava/io/FileOutputStream;);v24=(Conflicted);v37=(Short);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);v42=(Conflicted);
a=0;//     move-exception v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v12, v13
a=0;// 
a=0;//     .end local v13    # "f":Ljava/io/File;
a=0;//     .restart local v12    # "f":Ljava/io/File;
a=0;//     #v12=(Reference,Ljava/io/File;);
a=0;//     move-object/from16 v16, v17
a=0;// 
a=0;//     .end local v17    # "fout":Ljava/io/FileOutputStream;
a=0;//     .restart local v16    # "fout":Ljava/io/FileOutputStream;
a=0;//     #v16=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto/16 :goto_7
a=0;// .end method
a=0;// 
a=0;// .method public static downLoadImage(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 9
a=0;//     .param p0, "path"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0x2710
a=0;// 
a=0;//     .line 1313
a=0;//     #v7=(PosShort);
a=0;//     new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     .line 1314
a=0;//     .local v3, "httpClient":Lorg/apache/http/client/HttpClient;
a=0;//     #v3=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1315
a=0;//     .local v4, "httpParams":Lorg/apache/http/params/HttpParams;
a=0;//     #v4=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     invoke-static {v4, v7}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 1316
a=0;//     invoke-static {v4, v7}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 1317
a=0;//     new-instance v5, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-direct {v5, p0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1318
a=0;//     .local v5, "httpget":Lorg/apache/http/client/methods/HttpGet;
a=0;//     #v5=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 1321
a=0;//     .local v6, "response":Lorg/apache/http/HttpResponse;
a=0;//     :try_start_0
a=0;//     #v6=(Null);
a=0;//     invoke-interface {v3, v5}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1322
a=0;//     #v6=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v7}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/16 v8, 0xc8
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     if-ne v7, v8, :cond_3
a=0;// 
a=0;//     .line 1323
a=0;//     invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-static {v7}, Lorg/apache/http/util/EntityUtils;->toByteArray(Lorg/apache/http/HttpEntity;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1324
a=0;//     .local v1, "data":[B
a=0;//     #v1=(Reference,[B);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     array-length v8, v1
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v1, v7, v8}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;
a=0;//     :try_end_0
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1332
a=0;//     .local v0, "bitmap":Landroid/graphics/Bitmap;
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 1333
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v7}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     .line 1336
a=0;//     .end local v0    # "bitmap":Landroid/graphics/Bitmap;
a=0;//     .end local v1    # "data":[B
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1327
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 1328
a=0;//     .local v2, "e":Lorg/apache/http/client/ClientProtocolException;
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Lorg/apache/http/client/ClientProtocolException;);
a=0;//     invoke-virtual {v2}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 1332
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 1333
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v7}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     .line 1336
a=0;//     .end local v2    # "e":Lorg/apache/http/client/ClientProtocolException;
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v7=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1329
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 1330
a=0;//     .local v2, "e":Ljava/io/IOException;
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 1332
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 1333
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v7}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1331
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 1332
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 1333
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v8}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     .line 1335
a=0;//     :cond_2
a=0;//     #v8=(Conflicted);
a=0;//     throw v7
a=0;// 
a=0;//     .line 1332
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v2=(Uninit);v7=(Integer);v8=(PosShort);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 1333
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v7}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static downText(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 10
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "textid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 150
a=0;//     .local v5, "v":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 151
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 152
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 153
a=0;//     .local v2, "pt":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/book-text?textid=%s&ct=android&data=json&pt=%s&v=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object p1, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     aput-object v2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object v5, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     aput-object v3, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 154
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServerWithCache(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 155
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 156
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 164
a=0;//     :goto_0
a=0;//     return-object v6
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToRDBook(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static downVipText(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 14
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "textid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 234
a=0;//     #v8=(Null);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "\u6267\u884c\u666e\u901a\u8bfb\u7ae0\u8282|"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/base/util/LogUtils;->debug(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 235
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     sget-object v10, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     .line 236
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v10, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {p0, v9, v12}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 282
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);v10=(Conflicted);v11=(Conflicted);v12=(PosByte);v13=(Conflicted);
a=0;//     return-object v8
a=0;// 
a=0;//     .line 239
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Null);v9=(Boolean);v10=(Reference,Lcom/twocloo/base/common/NetType;);v11=(Uninit);v12=(Null);v13=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 243
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 244
a=0;//     .local v5, "uid":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/utils/CommonUtils;->getCustomChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 245
a=0;//     .local v0, "channel":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/utils/CommonUtils;->getChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 246
a=0;//     .local v3, "model":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 247
a=0;//     .local v1, "imei":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     sget v10, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 248
a=0;//     .local v4, "pt":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 249
a=0;//     .local v7, "v":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "http://app.2cloo.com/book-vip_text?textid=%s&ct=android&data=json&uid=%s&token=%s&srcid=%s&model=%s&imei=%s&pt=%s&v=%s"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const/16 v11, 0x8
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     new-array v11, v11, [Ljava/lang/Object;
a=0;// 
a=0;//     #v11=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p1, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     aput-object v5, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     aput-object v13, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x3
a=0;// 
a=0;//     aput-object v0, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x4
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     aput-object v13, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x5
a=0;// 
a=0;//     .line 250
a=0;//     aput-object v1, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x6
a=0;// 
a=0;//     aput-object v4, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x7
a=0;// 
a=0;//     aput-object v7, v11, v12
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 251
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 249
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 253
a=0;//     .local v6, "url":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Lcom/twocloo/com/cn/http/HttpImpl$1;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/twocloo/com/cn/http/HttpImpl$1;);
a=0;//     invoke-direct {v9}, Lcom/twocloo/com/cn/http/HttpImpl$1;-><init>()V
a=0;// 
a=0;//     .line 263
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/http/HttpImpl$1;);
a=0;//     new-instance v10, Lcom/twocloo/com/cn/http/HttpImpl$2;
a=0;// 
a=0;//     #v10=(UninitRef,Lcom/twocloo/com/cn/http/HttpImpl$2;);
a=0;//     invoke-direct {v10}, Lcom/twocloo/com/cn/http/HttpImpl$2;-><init>()V
a=0;// 
a=0;//     .line 253
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/http/HttpImpl$2;);
a=0;//     invoke-static {v6, v9, v10}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServerWithCache(Ljava/lang/String;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/Filter;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 278
a=0;//     .local v2, "json":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 282
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToRDBook(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static varargs downVipTexts(Ljava/lang/String;Landroid/app/Activity;[Ljava/lang/String;)Ljava/util/List;
a=0;//     .locals 25
a=0;//     .param p0, "articid"    # Ljava/lang/String;
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "textid"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/app/Activity;",
a=0;//             "[",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/RDBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     new-instance v10, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 170
a=0;//     .local v10, "lists":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/RDBook;>;"
a=0;//     #v10=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v17, ""
a=0;// 
a=0;//     .local v17, "uid":Ljava/lang/String;
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     const-string v16, ""
a=0;// 
a=0;//     .line 171
a=0;//     .local v16, "token":Ljava/lang/String;
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     #v20=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v20, :cond_0
a=0;// 
a=0;//     .line 172
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     invoke-virtual/range {v20 .. v20}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 173
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     invoke-virtual/range {v20 .. v20}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 177
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     invoke-static/range {v20 .. v20}, Lcom/twocloo/com/cn/utils/CommonUtils;->getCustomChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 178
a=0;//     .local v4, "channel":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     invoke-static/range {v20 .. v20}, Lcom/twocloo/com/cn/utils/CommonUtils;->getChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 179
a=0;//     .local v11, "model":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     invoke-static/range {v20 .. v20}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 180
a=0;//     .local v8, "imei":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v12=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-direct {v12, v0}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 181
a=0;//     .local v12, "phone":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v12=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     invoke-virtual {v12}, Lcom/twocloo/com/cn/common/PhoneInfo;->getCurrentVersion()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 182
a=0;//     .local v19, "v":I
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     sget v21, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     invoke-virtual/range {v20 .. v21}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 183
a=0;//     .local v2, "apptype":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v20, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v20=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v21
a=0;// 
a=0;//     #v21=(LongLo);v22=(LongHi);
a=0;//     invoke-virtual/range {v20 .. v22}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     invoke-static/range {v20 .. v20}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     const/16 v22, 0xa
a=0;// 
a=0;//     #v22=(PosByte);
a=0;//     invoke-virtual/range {v20 .. v22}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/CharSequence;);
a=0;//     check-cast v14, Ljava/lang/String;
a=0;// 
a=0;//     .line 184
a=0;//     .local v14, "t":Ljava/lang/String;
a=0;//     new-instance v20, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v20=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     new-instance v21, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v21=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {v17 .. v17}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v21 .. v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     const-string v22, "tokentoken"
a=0;// 
a=0;//     invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     invoke-static/range {v21 .. v21}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     invoke-static/range {v21 .. v21}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     invoke-direct/range {v20 .. v21}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v21, "tokentoken"
a=0;// 
a=0;//     invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     invoke-static/range {v20 .. v20}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     const/16 v22, 0xa
a=0;// 
a=0;//     #v22=(PosByte);
a=0;//     invoke-virtual/range {v20 .. v22}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 188
a=0;//     .local v3, "auth":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 189
a=0;//     .local v7, "ids":Ljava/lang/StringBuffer;
a=0;//     #v7=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const-string v13, ""
a=0;// 
a=0;//     .line 190
a=0;//     .local v13, "strIds":Ljava/lang/String;
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v15=(Conflicted);v20=(Integer);v22=(Conflicted);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuffer;->length()I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     if-lez v20, :cond_1
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/String;);
a=0;//     const-string v21, ","
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v20 .. v21}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Boolean);
a=0;//     if-eqz v20, :cond_1
a=0;// 
a=0;//     .line 195
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/String;);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     add-int/lit8 v22, v22, -0x1
a=0;// 
a=0;//     invoke-virtual/range {v20 .. v22}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 197
a=0;//     :cond_1
a=0;//     #v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 200
a=0;//     #v7=(Null);
a=0;//     const-string v18, ""
a=0;// 
a=0;//     .line 201
a=0;//     .local v18, "url":Ljava/lang/String;
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     #v20=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v20, :cond_3
a=0;// 
a=0;//     .line 202
a=0;//     new-instance v20, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v20=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v21, Lcom/twocloo/com/cn/common/Constants;->REQUEST_URL:Ljava/lang/String;
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     const/16 v22, 0xa
a=0;// 
a=0;//     #v22=(PosByte);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v22, v0
a=0;// 
a=0;//     #v22=(Reference,[Ljava/lang/Object;);
a=0;//     const/16 v23, 0x0
a=0;// 
a=0;//     #v23=(Null);
a=0;//     aput-object p0, v22, v23
a=0;// 
a=0;//     const/16 v23, 0x1
a=0;// 
a=0;//     #v23=(One);
a=0;//     aput-object v13, v22, v23
a=0;// 
a=0;//     const/16 v23, 0x2
a=0;// 
a=0;//     #v23=(PosByte);
a=0;//     aput-object v17, v22, v23
a=0;// 
a=0;//     const/16 v23, 0x3
a=0;// 
a=0;//     aput-object v16, v22, v23
a=0;// 
a=0;//     const/16 v23, 0x4
a=0;// 
a=0;//     aput-object v3, v22, v23
a=0;// 
a=0;//     const/16 v23, 0x5
a=0;// 
a=0;//     aput-object v14, v22, v23
a=0;// 
a=0;//     const/16 v23, 0x6
a=0;// 
a=0;//     invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v24, v22, v23
a=0;// 
a=0;//     const/16 v23, 0x7
a=0;// 
a=0;//     const-string v24, "android"
a=0;// 
a=0;//     aput-object v24, v22, v23
a=0;// 
a=0;//     const/16 v23, 0x8
a=0;// 
a=0;//     aput-object v2, v22, v23
a=0;// 
a=0;//     const/16 v23, 0x9
a=0;// 
a=0;//     aput-object v4, v22, v23
a=0;// 
a=0;//     invoke-static/range {v21 .. v22}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     invoke-static/range {v21 .. v21}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     invoke-direct/range {v20 .. v21}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 203
a=0;//     #v20=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {p1 .. p1}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 210
a=0;//     :goto_1
a=0;//     :try_start_0
a=0;//     const-string v6, ""
a=0;// 
a=0;//     .line 211
a=0;//     .local v6, "getResult":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     #v20=(Null);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, v20
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/http/HttpHelper;->get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 212
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 226
a=0;//     .end local v6    # "getResult":Ljava/lang/String;
a=0;//     .end local v10    # "lists":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/RDBook;>;"
a=0;//     :goto_2
a=0;//     #v1=(Integer);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);v20=(Reference,Ujava/lang/Object;);
a=0;//     return-object v10
a=0;// 
a=0;//     .line 190
a=0;//     .end local v18    # "url":Ljava/lang/String;
a=0;//     .restart local v10    # "lists":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/RDBook;>;"
a=0;//     :cond_2
a=0;//     #v0=(Integer);v5=(Uninit);v6=(Uninit);v7=(Reference,Ljava/lang/StringBuffer;);v9=(Uninit);v18=(Uninit);v20=(Integer);v21=(Integer);v22=(Conflicted);v23=(Uninit);v24=(Uninit);
a=0;//     aget-object v15, p2, v20
a=0;// 
a=0;//     .line 191
a=0;//     .local v15, "tid":Ljava/lang/String;
a=0;//     #v15=(Null);
a=0;//     invoke-virtual {v7, v15}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 192
a=0;//     const-string v22, ","
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 190
a=0;//     add-int/lit8 v20, v20, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 206
a=0;//     .end local v15    # "tid":Ljava/lang/String;
a=0;//     .restart local v18    # "url":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v0=(Integer);v7=(Null);v15=(Conflicted);v18=(Reference,Ljava/lang/String;);v20=(Reference,Lcom/twocloo/com/cn/beans/User;);v21=(Conflicted);v22=(Conflicted);
a=0;//     new-instance v20, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v20=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v21, Lcom/twocloo/com/cn/common/Constants;->REQUEST_UNLOGIN_URL:Ljava/lang/String;
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     const/16 v22, 0x5
a=0;// 
a=0;//     #v22=(PosByte);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     move-object/from16 v22, v0
a=0;// 
a=0;//     #v22=(Reference,[Ljava/lang/Object;);
a=0;//     const/16 v23, 0x0
a=0;// 
a=0;//     #v23=(Null);
a=0;//     aput-object p2, v22, v23
a=0;// 
a=0;//     const/16 v23, 0x1
a=0;// 
a=0;//     #v23=(One);
a=0;//     aput-object v4, v22, v23
a=0;// 
a=0;//     const/16 v23, 0x2
a=0;// 
a=0;//     #v23=(PosByte);
a=0;//     aput-object v2, v22, v23
a=0;// 
a=0;//     const/16 v23, 0x3
a=0;// 
a=0;//     aput-object v8, v22, v23
a=0;// 
a=0;//     const/16 v23, 0x4
a=0;// 
a=0;//     invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v24, v22, v23
a=0;// 
a=0;//     invoke-static/range {v21 .. v22}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     invoke-static/range {v21 .. v21}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     invoke-direct/range {v20 .. v21}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {p1 .. p1}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 214
a=0;//     .restart local v6    # "getResult":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v1=(Null);v6=(Reference,Ljava/lang/String;);v20=(Null);
a=0;//     new-instance v9, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v9=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v9, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 216
a=0;//     .local v9, "json":Lorg/json/JSONObject;
a=0;//     #v9=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     #v20=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v20, :cond_5
a=0;// 
a=0;//     .line 217
a=0;//     invoke-static {v9, v10}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToRDBooks(Lorg/json/JSONObject;Ljava/util/List;)Ljava/util/List;
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 223
a=0;//     .end local v6    # "getResult":Ljava/lang/String;
a=0;//     .end local v9    # "json":Lorg/json/JSONObject;
a=0;//     :catch_0
a=0;//     #v1=(Integer);v6=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 224
a=0;//     .local v5, "e":Lorg/json/JSONException;
a=0;//     #v5=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v5}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 219
a=0;//     .end local v5    # "e":Lorg/json/JSONException;
a=0;//     .restart local v6    # "getResult":Ljava/lang/String;
a=0;//     .restart local v9    # "json":Lorg/json/JSONObject;
a=0;//     :cond_5
a=0;//     :try_start_2
a=0;//     #v1=(Null);v5=(Uninit);v6=(Reference,Ljava/lang/String;);v9=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {v9, v10}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToRDBookss(Lorg/json/JSONObject;Ljava/util/List;)Ljava/util/List;
a=0;//     :try_end_2
a=0;//     .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static editprofile(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Lorg/json/JSONObject;
a=0;//     .locals 11
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "nickname"    # Ljava/lang/String;
a=0;//     .param p2, "signature"    # Ljava/lang/String;
a=0;//     .param p3, "labels"    # Ljava/lang/String;
a=0;//     .param p4, "sex"    # Ljava/lang/String;
a=0;//     .param p5, "age"    # Ljava/lang/String;
a=0;//     .param p6, "constellation"    # Ljava/lang/String;
a=0;//     .param p7, "user_id"    # Ljava/lang/String;
a=0;//     .param p8, "token"    # Ljava/lang/String;
a=0;//     .param p9, "yearBirth"    # I
a=0;//     .param p10, "monthBirth"    # I
a=0;//     .param p11, "dayBirth"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 364
a=0;//     new-instance v4, Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v4}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 365
a=0;//     .local v4, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 366
a=0;//     .local v7, "v":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v8}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 367
a=0;//     .local v6, "srcid":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 368
a=0;//     .local v1, "imei":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 369
a=0;//     .local v5, "pt":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {p7 .. p7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 370
a=0;//     .local v3, "md5":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/16 v9, 0xa
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v3, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 371
a=0;//     const-string v8, "sign"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4, v8, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 372
a=0;//     const-string v8, "mark"
a=0;// 
a=0;//     invoke-interface {v4, v8, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 373
a=0;//     const-string v8, "nickname"
a=0;// 
a=0;//     invoke-interface {v4, v8, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 374
a=0;//     const-string v8, "sex"
a=0;// 
a=0;//     invoke-interface {v4, v8, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 375
a=0;//     const-string v8, "age"
a=0;// 
a=0;//     move-object/from16 v0, p5
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 376
a=0;//     const-string v8, "userid"
a=0;// 
a=0;//     move-object/from16 v0, p7
a=0;// 
a=0;//     invoke-interface {v4, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 377
a=0;//     const-string v8, "token"
a=0;// 
a=0;//     move-object/from16 v0, p8
a=0;// 
a=0;//     invoke-interface {v4, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 378
a=0;//     const-string v8, "star"
a=0;// 
a=0;//     move-object/from16 v0, p6
a=0;// 
a=0;//     invoke-interface {v4, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 379
a=0;//     const-string v8, "birth_year"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {p9 .. p9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-interface {v4, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 380
a=0;//     const-string v8, "birth_month"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {p10 .. p10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-interface {v4, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 381
a=0;//     const-string v8, "birth_day"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {p11 .. p11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-interface {v4, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 382
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "http://app.2cloo.com/user-update_info?"
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8, v4}, Lcom/twocloo/com/cn/http/HttpComm;->post(Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 383
a=0;//     .local v2, "json":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static getBindMobile(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 10
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 481
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 482
a=0;//     .local v5, "v":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 483
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 484
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 485
a=0;//     .local v2, "pt":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/user-is_bind_user?uid=%s&k=%s&ct=android&pt=%s&srcid=%s&v=%s&imei=%s"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x6
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object p1, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     aput-object p2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object v2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     aput-object v3, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     aput-object v5, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 486
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 488
a=0;//     .local v1, "jobj":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static getMorebooks(Landroid/app/Activity;Ljava/lang/String;I)Ljava/util/ArrayList;
a=0;//     .locals 12
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "articleid"    # Ljava/lang/String;
a=0;//     .param p2, "size"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Ljava/lang/String;",
a=0;//             "I)",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/LikeMoreBookBean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1138
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 1139
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1140
a=0;//     .local v3, "pt":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 1141
a=0;//     .local v1, "info":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/common/PhoneInfo;->getCurrentVersion()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1142
a=0;//     .local v6, "v":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1143
a=0;//     .local v4, "srcid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "http://app.2cloo.com/book-article_rec?pt=%s&ct=%s&v=%s&srcid=%s&articleid=%s&size=%s"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x6
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     aput-object v3, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     aput-object v0, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     aput-object v6, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x3
a=0;// 
a=0;//     aput-object v4, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     aput-object p1, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x5
a=0;// 
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1145
a=0;//     .local v5, "url":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1146
a=0;//     .local v2, "json":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 1147
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1149
a=0;//     :goto_0
a=0;//     return-object v7
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/JsonToBean;->jsonToLikemoreBook(Lorg/json/JSONObject;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getRechargeChannle(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Map;
a=0;//     .locals 12
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1027
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1028
a=0;//     .local v3, "result":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1029
a=0;//     .local v5, "token":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 1030
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1031
a=0;//     .local v2, "pt":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     move-object v8, p0
a=0;// 
a=0;//     check-cast v8, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-direct {v1, v8}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 1032
a=0;//     .local v1, "info":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/common/PhoneInfo;->getCurrentVersion()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1033
a=0;//     .local v7, "versioncode":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1034
a=0;//     .local v4, "srcid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 1035
a=0;//     .local v6, "url":Ljava/lang/String;
a=0;//     #v6=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 1036
a=0;//     const-string v8, "http://app.2cloo.com/user-recharge_channel_list&uid=%s&token=%s&pt=%s&ct=%s&v=%s&srcid=%s"
a=0;// 
a=0;//     const/4 v9, 0x6
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const-string v11, ""
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const-string v11, ""
a=0;// 
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     aput-object v2, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x3
a=0;// 
a=0;//     aput-object v0, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     aput-object v7, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x5
a=0;// 
a=0;//     aput-object v4, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1041
a=0;//     :goto_0
a=0;//     #v6=(Reference,Ljava/lang/String;);v11=(Conflicted);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getRechargeChannelDatas(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/http/HttpComm;->isNetworkAvalible(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_1
a=0;// 
a=0;//     .line 1042
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getRechargeChannelDatas(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1051
a=0;//     :goto_1
a=0;//     #v3=(Reference,Ljava/lang/String;);v8=(Conflicted);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/http/HttpImpl;->parseRechargeChannel(Ljava/lang/String;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/Map;);
a=0;//     return-object v8
a=0;// 
a=0;//     .line 1038
a=0;//     :cond_0
a=0;//     #v3=(Null);v6=(Null);v9=(Integer);v10=(Uninit);v11=(Uninit);
a=0;//     const-string v8, "http://app.2cloo.com/user-recharge_channel_list&uid=%s&token=%s&pt=%s&ct=%s&v=%s&srcid=%s"
a=0;// 
a=0;//     const/4 v9, 0x6
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     aput-object p1, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     aput-object v5, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     aput-object v2, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x3
a=0;// 
a=0;//     aput-object v0, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     aput-object v7, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x5
a=0;// 
a=0;//     aput-object v4, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1044
a=0;//     :cond_1
a=0;//     #v8=(Conflicted);v11=(Conflicted);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getRechargeChannelDatas(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 1045
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getRechargeChannelDatas(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1046
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1047
a=0;//     :cond_2
a=0;//     #v3=(Null);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer2(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1048
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setRechargeChannleDatas(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getRechargeChannleList(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 9
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1089
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel_type:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1090
a=0;//     .local v1, "pt":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 1091
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getAppVersionCode(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1092
a=0;//     .local v5, "v":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1093
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "http://app.2cloo.com/user-recharge_channel_list&uid=%s&token=%s&pt=%s&ct=%s&v=%s&srcid=%s"
a=0;// 
a=0;//     const/4 v7, 0x6
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     aput-object p1, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     aput-object p2, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     aput-object v1, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     aput-object v0, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     aput-object v5, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     aput-object v3, v7, v8
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1095
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer2(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1097
a=0;//     .local v2, "result":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static getUsercenterdatas(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;//     .locals 6
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "userid"    # Ljava/lang/String;
a=0;//     .param p2, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 771
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "http://app.2cloo.com/user-user_index?uid=%s&token=%s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object p1, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     aput-object p2, v4, v5
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "&app_type=0"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 772
a=0;//     .local v1, "url":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 773
a=0;//     .local v0, "json":Lorg/json/JSONObject;
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 774
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 775
a=0;//     :goto_0
a=0;//     return-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToUserCenterNewBean(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getbooks(Landroid/app/Activity;Ljava/lang/String;IILjava/lang/String;)Lcom/twocloo/com/cn/beans/OtherBookInfo;
a=0;//     .locals 13
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "authorid"    # Ljava/lang/String;
a=0;//     .param p2, "page"    # I
a=0;//     .param p3, "size"    # I
a=0;//     .param p4, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1111
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 1112
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1113
a=0;//     .local v4, "pt":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 1114
a=0;//     .local v1, "info":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/common/PhoneInfo;->getCurrentVersion()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1115
a=0;//     .local v7, "v":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1116
a=0;//     .local v5, "srcid":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "http://app.2cloo.com/book-user_article?pt=%s&ct=%s&v=%s&srcid=%s&authorid=%s&page=%s&size=%s&articleid=%s"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/16 v10, 0x8
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     new-array v10, v10, [Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aput-object v4, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     aput-object v0, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     aput-object v7, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     aput-object v5, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x4
a=0;// 
a=0;//     aput-object p1, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x5
a=0;// 
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v12, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x6
a=0;// 
a=0;//     invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     aput-object v12, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x7
a=0;// 
a=0;//     aput-object p4, v10, v11
a=0;// 
a=0;//     invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1117
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1116
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1119
a=0;//     .local v6, "url":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServerWithCache(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1120
a=0;//     .local v2, "json":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 1121
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1123
a=0;//     :goto_0
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/OtherBookInfo;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 1122
a=0;//     :cond_0
a=0;//     #v3=(Uninit);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/JsonToBean;->jsonToOtherbook(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/OtherBookInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1123
a=0;//     .local v3, "otherbookInfo":Lcom/twocloo/com/cn/beans/OtherBookInfo;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/OtherBookInfo;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static login(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;
a=0;//     .locals 12
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "username"    # Ljava/lang/String;
a=0;//     .param p2, "passwdhash"    # Ljava/lang/String;
a=0;//     .param p3, "isHash"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 412
a=0;//     :try_start_0
a=0;//     const-string v8, "gb2312"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v8}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 417
a=0;//     if-nez p3, :cond_0
a=0;// 
a=0;//     .line 418
a=0;//     invoke-static {p2}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 420
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 421
a=0;//     .local v0, "apptype":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 422
a=0;//     .local v2, "imie":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/PhoneUtils;->getMacAddress(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 423
a=0;//     .local v4, "macAddress":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 424
a=0;//     .local v7, "v":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 425
a=0;//     .local v5, "srcid":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "http://app.2cloo.com/user-login?username=%s&passwdhash=%s&pt=%s&imei=%s&mac_address=%s&ct=android&v=%s&data=json&srcid=%s"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v10, 0x7
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     new-array v10, v10, [Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aput-object p1, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     aput-object p2, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     aput-object v0, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     aput-object v2, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x4
a=0;// 
a=0;//     aput-object v4, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x5
a=0;// 
a=0;//     aput-object v7, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x6
a=0;// 
a=0;//     aput-object v5, v10, v11
a=0;// 
a=0;//     invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 426
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     check-cast p0, Landroid/app/Activity;
a=0;// 
a=0;//     .end local p0    # "context":Landroid/content/Context;
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 425
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 427
a=0;//     .local v6, "url":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 429
a=0;//     .end local v0    # "apptype":Ljava/lang/String;
a=0;//     .end local v2    # "imie":Ljava/lang/String;
a=0;//     .end local v4    # "macAddress":Ljava/lang/String;
a=0;//     .end local v5    # "srcid":Ljava/lang/String;
a=0;//     .end local v6    # "url":Ljava/lang/String;
a=0;//     .end local v7    # "v":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Lorg/json/JSONObject;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 413
a=0;//     .restart local p0    # "context":Landroid/content/Context;
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 414
a=0;//     .local v1, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v1=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 415
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static noticeCheck(Landroid/app/Activity;)Lcom/twocloo/com/cn/beans/NoticeCheck;
a=0;//     .locals 14
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 981
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/utils/CommonUtils;->getChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 983
a=0;//     .local v0, "curChannel":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneModel()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 984
a=0;//     .local v3, "model":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 985
a=0;//     .local v1, "imei":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/utils/CommonUtils;->getAppVersionCode(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 986
a=0;//     .local v8, "versioncode":I
a=0;//     #v8=(Integer);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     sget v10, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 987
a=0;//     .local v5, "pt":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 988
a=0;//     .local v6, "uid":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "http://app.2cloo.com/store-client_notice?id=%s&model=%s&imei=%s&versioncode=%s&uid=%s&guide=1&pt=%s"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const/4 v11, 0x6
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     new-array v11, v11, [Ljava/lang/Object;
a=0;// 
a=0;//     #v11=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     aput-object v0, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     aput-object v3, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     aput-object v1, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x3
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v13, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x4
a=0;// 
a=0;//     aput-object v6, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x5
a=0;// 
a=0;//     aput-object v5, v11, v12
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 989
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 988
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 990
a=0;//     .local v7, "url":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 992
a=0;//     .local v2, "json":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 993
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 996
a=0;//     :goto_1
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/NoticeCheck;);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 987
a=0;//     .end local v2    # "json":Lorg/json/JSONObject;
a=0;//     .end local v6    # "uid":Ljava/lang/String;
a=0;//     .end local v7    # "url":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v10=(Integer);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     const-string v6, "0"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 995
a=0;//     .restart local v2    # "json":Lorg/json/JSONObject;
a=0;//     .restart local v6    # "uid":Ljava/lang/String;
a=0;//     .restart local v7    # "url":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);v7=(Reference,Ljava/lang/String;);v10=(Reference,Ljava/lang/String;);v11=(Reference,[Ljava/lang/Object;);v12=(PosByte);v13=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/JsonToBean;->jsonToNoticeCheck(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/NoticeCheck;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 996
a=0;//     .local v4, "noticeCheck":Lcom/twocloo/com/cn/beans/NoticeCheck;
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/NoticeCheck;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static oneKeyRegist(Landroid/content/Context;)Lorg/json/JSONObject;
a=0;//     .locals 16
a=0;//     .param p0, "c"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 390
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     .line 391
a=0;//     .local v8, "time":J
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     const/16 v14, 0xa
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     invoke-virtual {v12, v13, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 392
a=0;//     .local v7, "t":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-static {v12}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 393
a=0;//     .local v0, "auth":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     const/16 v13, 0xa
a=0;// 
a=0;//     #v13=(PosByte);
a=0;//     invoke-virtual {v0, v12, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 394
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 395
a=0;//     .local v2, "imie":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/base/util/PhoneUtils;->getMacAddress(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 396
a=0;//     .local v4, "macAddress":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v13, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 397
a=0;//     .local v6, "scrid":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "android"
a=0;// 
a=0;//     .line 398
a=0;//     .local v1, "ct":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     sget v13, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 399
a=0;//     .local v5, "pt":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 400
a=0;//     .local v11, "v":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "http://app.2cloo.com/user-quick_reg?t=%s&auth=%s&imei=%s&mac_address=%s&srcid=%s&ct=%s&pt=%s&v=%s"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     const/16 v14, 0x8
a=0;// 
a=0;//     new-array v14, v14, [Ljava/lang/Object;
a=0;// 
a=0;//     #v14=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     aput-object v7, v14, v15
a=0;// 
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     aput-object v0, v14, v15
a=0;// 
a=0;//     const/4 v15, 0x2
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     aput-object v2, v14, v15
a=0;// 
a=0;//     const/4 v15, 0x3
a=0;// 
a=0;//     aput-object v4, v14, v15
a=0;// 
a=0;//     const/4 v15, 0x4
a=0;// 
a=0;//     aput-object v6, v14, v15
a=0;// 
a=0;//     const/4 v15, 0x5
a=0;// 
a=0;//     aput-object v1, v14, v15
a=0;// 
a=0;//     const/4 v15, 0x6
a=0;// 
a=0;//     aput-object v5, v14, v15
a=0;// 
a=0;//     const/4 v15, 0x7
a=0;// 
a=0;//     aput-object v11, v14, v15
a=0;// 
a=0;//     invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 401
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     check-cast p0, Landroid/app/Activity;
a=0;// 
a=0;//     .end local p0    # "c":Landroid/content/Context;
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 400
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 403
a=0;//     .local v10, "url":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 404
a=0;//     .local v3, "json":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v3
a=0;// .end method
a=0;// 
a=0;// .method public static parseJson(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .locals 2
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 875
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 876
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 888
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 878
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/BFBook;-><init>()V
a=0;// 
a=0;//     .line 879
a=0;//     .local v0, "bf":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     const-string v1, "author"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 880
a=0;//     const-string v1, "author"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BFBook;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 882
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "book_logo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 883
a=0;//     const-string v1, "book_logo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BFBook;->setImgFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 885
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "title"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 886
a=0;//     const-string v1, "title"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BFBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static parseRechargeChannel(Ljava/lang/String;)Ljava/util/Map;
a=0;//     .locals 9
a=0;//     .param p0, "json"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1062
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 1063
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1077
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Ljava/util/HashMap;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 1065
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     new-instance v5, Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v5}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 1067
a=0;//     .local v5, "maps":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;"
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1068
a=0;//     .local v1, "j":I
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v3, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-direct {v3, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1069
a=0;//     .local v3, "ja":Lorg/json/JSONArray;
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     #v0=(Null);
a=0;//     move v2, v1
a=0;// 
a=0;//     .end local v1    # "j":I
a=0;//     .local v2, "j":I
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Integer);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v0, v6, :cond_0
a=0;// 
a=0;//     .line 1070
a=0;//     invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1071
a=0;//     .local v4, "jo":Lorg/json/JSONObject;
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v6, "title"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 1072
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     .end local v2    # "j":I
a=0;//     .restart local v1    # "j":I
a=0;//     :try_start_2
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "title"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, ","
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "api_url"
a=0;// 
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     .line 1069
a=0;//     :goto_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .end local v1    # "j":I
a=0;//     .restart local v2    # "j":I
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1075
a=0;//     .end local v0    # "i":I
a=0;//     .end local v2    # "j":I
a=0;//     .end local v3    # "ja":Lorg/json/JSONArray;
a=0;//     .end local v4    # "jo":Lorg/json/JSONObject;
a=0;//     .restart local v1    # "j":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v1    # "j":I
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v2    # "j":I
a=0;//     .restart local v3    # "ja":Lorg/json/JSONArray;
a=0;//     :catch_1
a=0;//     #v0=(Integer);v2=(Integer);v3=(Reference,Lorg/json/JSONArray;);v6=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Exception;);
a=0;//     move v1, v2
a=0;// 
a=0;//     .end local v2    # "j":I
a=0;//     .restart local v1    # "j":I
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v1    # "j":I
a=0;//     .restart local v2    # "j":I
a=0;//     .restart local v4    # "jo":Lorg/json/JSONObject;
a=0;//     :cond_2
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);v6=(Boolean);
a=0;//     move v1, v2
a=0;// 
a=0;//     .end local v2    # "j":I
a=0;//     .restart local v1    # "j":I
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static prepareVipText(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 7
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "textid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 289
a=0;//     #v6=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 290
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 312
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Boolean);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 292
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\u6267\u884c\u5f3a\u5236\u8bfb\u7ae0\u8282|"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/LogUtils;->debug(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 293
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/16 v4, 0xa
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 294
a=0;//     .local v1, "token":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "http://app.2cloo.com/book-prepare_vip_text?textid=%s&ct=android&data=json&token=%s&pt=%s&v=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     new-array v5, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object p1, v5, v6
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     aput-object v1, v5, v6
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 295
a=0;//     .local v2, "url":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/http/HttpImpl$3;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/http/HttpImpl$3;);
a=0;//     invoke-direct {v3}, Lcom/twocloo/com/cn/http/HttpImpl$3;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/http/HttpImpl$3;);
a=0;//     invoke-static {v2, v3}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServerWithCache(Ljava/lang/String;Lcom/twocloo/base/cache/Filter;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 312
a=0;//     .local v0, "json":Lorg/json/JSONObject;
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToRDBook(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static regist(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 9
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "username"    # Ljava/lang/String;
a=0;//     .param p2, "passwdhash"    # Ljava/lang/String;
a=0;//     .param p3, "mobile"    # Ljava/lang/String;
a=0;//     .param p4, "nickname"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 340
a=0;//     new-instance v3, Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v3}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 341
a=0;//     .local v3, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 342
a=0;//     .local v6, "v":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 343
a=0;//     .local v5, "srcid":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 344
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 345
a=0;//     .local v4, "pt":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 346
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 347
a=0;//     .local v2, "md5":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/16 v8, 0xa
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {v2, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 349
a=0;//     const-string v7, "username"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v7, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 350
a=0;//     const-string v7, "passwdhash"
a=0;// 
a=0;//     invoke-interface {v3, v7, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 351
a=0;//     const-string v7, "tel"
a=0;// 
a=0;//     invoke-interface {v3, v7, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 352
a=0;//     const-string v7, "nickname"
a=0;// 
a=0;//     invoke-interface {v3, v7, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 353
a=0;//     const-string v7, "auth"
a=0;// 
a=0;//     invoke-interface {v3, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 355
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "http://app.2cloo.com/user-reg?"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7, v3}, Lcom/twocloo/com/cn/http/HttpComm;->post(Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 356
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static replyinfo(Landroid/app/Activity;IILjava/lang/String;II)Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;//     .locals 7
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "tid"    # I
a=0;//     .param p2, "pid"    # I
a=0;//     .param p3, "articleid"    # Ljava/lang/String;
a=0;//     .param p4, "page"    # I
a=0;//     .param p5, "size"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1185
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "http://app.2cloo.com/book-shuping_reply?tid=%s&pid=%s&articleid=%s&ct=android&data=json&page=%s&size=%s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     aput-object p3, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1186
a=0;//     .local v1, "url":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1187
a=0;//     .local v0, "jo":Lorg/json/JSONObject;
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1188
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1190
a=0;//     :goto_0
a=0;//     return-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToShupinginfo(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static seachList(Landroid/app/Activity;Ljava/lang/String;I)Lcom/twocloo/com/cn/beans/SearchResult;
a=0;//     .locals 7
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "word"    # Ljava/lang/String;
a=0;//     .param p2, "page"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1214
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "http://app.2cloo.com/Search-index?word=%s&page=%s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object p1, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v4, v5
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1216
a=0;//     .local v1, "url":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1218
a=0;//     .local v0, "json":Lorg/json/JSONObject;
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1219
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1220
a=0;//     :goto_0
a=0;//     return-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToSearch(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static sendActiveCount(Ljava/util/Map;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 974
a=0;//     .local p0, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     const-string v0, "http://app.2cloo.com/user-start?"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p0}, Lcom/twocloo/com/cn/http/HttpComm;->post(Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 975
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static sendHardInfo(Landroid/content/Context;)Lorg/json/JSONObject;
a=0;//     .locals 11
a=0;//     .param p0, "c"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 94
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lcom/twocloo/base/util/PhoneUtils;->getMacAddress(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 95
a=0;//     .local v2, "macAddress":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 96
a=0;//     .local v3, "pt":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 97
a=0;//     .local v6, "v":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 98
a=0;//     .local v4, "srcid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "http://app.2cloo.com/user-physical_login?imei=%s&mac_address=%s&pt=%s&ct=android&v=%s&data=json&srcid=%s"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     aput-object v0, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     aput-object v2, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     aput-object v3, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x3
a=0;// 
a=0;//     aput-object v6, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     aput-object v4, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     check-cast p0, Landroid/app/Activity;
a=0;// 
a=0;//     .end local p0    # "c":Landroid/content/Context;
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 99
a=0;//     .local v5, "url":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 100
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static sendPhoneInfoFeedBack(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 9
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "token"    # Ljava/lang/String;
a=0;//     .param p3, "v1"    # Ljava/lang/String;
a=0;//     .param p4, "v2"    # Ljava/lang/String;
a=0;//     .param p5, "v3"    # Ljava/lang/String;
a=0;//     .param p6, "v4"    # Ljava/lang/String;
a=0;//     .param p7, "flag"    # I
a=0;//     .param p8, "pt"    # Ljava/lang/String;
a=0;//     .param p9, "ct"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 954
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "http://app.2cloo.com/user-feedback?uid=%s&token=%s&type=%s&pt=%s&ct=%s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object p1, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aput-object p2, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static/range {p7 .. p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     aput-object p8, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     aput-object p9, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 955
a=0;//     .local v0, "url":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move-object v1, p3
a=0;// 
a=0;//     move-object v2, p4
a=0;// 
a=0;//     move-object v3, p5
a=0;// 
a=0;//     move-object v4, p6
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v8}, Lcom/twocloo/com/cn/http/HttpComm;->postMsg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 957
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static sendPhoneInfoInstall(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 10
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "v1"    # Ljava/lang/String;
a=0;//     .param p2, "v2"    # Ljava/lang/String;
a=0;//     .param p3, "v3"    # Ljava/lang/String;
a=0;//     .param p4, "v4"    # Ljava/lang/String;
a=0;//     .param p5, "versioncode"    # Ljava/lang/String;
a=0;//     .param p6, "apptype"    # Ljava/lang/String;
a=0;//     .param p7, "clienttype"    # Ljava/lang/String;
a=0;//     .param p8, "articleid"    # Ljava/lang/String;
a=0;//     .param p9, "uid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 964
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static/range {p9 .. p9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 965
a=0;//     .local v9, "token":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "http://app.2cloo.com/user-installed?uid=%s&token=%s"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object p9, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aput-object v9, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "url":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v2, p2
a=0;// 
a=0;//     move-object v3, p3
a=0;// 
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v6, p6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v7, p7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v8, p8
a=0;// 
a=0;//     .line 966
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v0 .. v8}, Lcom/twocloo/com/cn/http/HttpComm;->postMsg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public static subText(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;//     .locals 17
a=0;//     .param p0, "textid"    # Ljava/lang/String;
a=0;//     .param p1, "curtime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 803
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-nez v13, :cond_1
a=0;// 
a=0;//     .line 804
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 820
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Lorg/json/JSONObject;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 806
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 807
a=0;//     .local v11, "uid":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     move-wide/from16 v9, p1
a=0;// 
a=0;//     .line 808
a=0;//     .local v9, "t":J
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v14, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     const-string v15, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v14}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     const/16 v15, 0xa
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     invoke-virtual {v13, v14, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 809
a=0;//     .local v1, "auth":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-wide/from16 v7, p1
a=0;// 
a=0;//     .line 810
a=0;//     .local v7, "srcT":J
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/utils/CommonUtils;->getCustomChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 811
a=0;//     .local v2, "channel":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v8}, Lcom/twocloo/com/cn/utils/CommonUtils;->getCustomAuth(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 812
a=0;//     .local v6, "srcAuth":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/utils/CommonUtils;->getChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 813
a=0;//     .local v5, "model":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 814
a=0;//     .local v3, "imei":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 815
a=0;//     .local v0, "apptype":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v13, "http://app.2cloo.com/book-sub_text?textid=%s&uid=%s&ct=android&data=json&token=%s&auth=%s&t=%s&srcid=%s&srcauth=%s&model=%s&imei=%s&pt=%s"
a=0;// 
a=0;//     const/16 v14, 0xa
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     new-array v14, v14, [Ljava/lang/Object;
a=0;// 
a=0;//     #v14=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     aput-object p0, v14, v15
a=0;// 
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     aput-object v11, v14, v15
a=0;// 
a=0;//     const/4 v15, 0x2
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual/range {v16 .. v16}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     aput-object v16, v14, v15
a=0;// 
a=0;//     const/4 v15, 0x3
a=0;// 
a=0;//     aput-object v1, v14, v15
a=0;// 
a=0;//     const/4 v15, 0x4
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     aput-object v16, v14, v15
a=0;// 
a=0;//     const/4 v15, 0x5
a=0;// 
a=0;//     aput-object v2, v14, v15
a=0;// 
a=0;//     const/4 v15, 0x6
a=0;// 
a=0;//     aput-object v6, v14, v15
a=0;// 
a=0;//     const/4 v15, 0x7
a=0;// 
a=0;//     .line 816
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     aput-object v16, v14, v15
a=0;// 
a=0;//     const/16 v15, 0x8
a=0;// 
a=0;//     aput-object v3, v14, v15
a=0;// 
a=0;//     const/16 v15, 0x9
a=0;// 
a=0;//     aput-object v0, v14, v15
a=0;// 
a=0;//     .line 815
a=0;//     invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 817
a=0;//     .local v12, "url":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v12}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 818
a=0;//     .local v4, "json":Lorg/json/JSONObject;
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 819
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static synMyfavor(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 10
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "token"    # Ljava/lang/String;
a=0;//     .param p3, "add"    # Ljava/lang/String;
a=0;//     .param p4, "del"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 495
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 496
a=0;//     .local v5, "v":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 497
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 498
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 499
a=0;//     .local v2, "pt":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/book-synchro_myfavor?uid=%s&token=%s&ct=android&data=json&add_ids=%s&del_ids=%s&pt=%s&srcid=%s&v=%s&imei=%s"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/16 v8, 0x8
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object p1, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     aput-object p2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object p3, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     aput-object p4, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     aput-object v2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     aput-object v3, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x6
a=0;// 
a=0;//     aput-object v5, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x7
a=0;// 
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 500
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 499
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 501
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 502
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static syncBFBook(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Vector;
a=0;//     .locals 11
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "token"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 897
a=0;//     #v10=(One);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 898
a=0;//     .local v5, "v":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 899
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 900
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 901
a=0;//     .local v2, "pt":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/book-myfavor?uid=%s&token=%s&ct=android&data=json&pt=%s&v=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x6
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object p1, v8, v9
a=0;// 
a=0;//     aput-object p2, v8, v10
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object v2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     aput-object v5, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     aput-object v3, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 902
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v10}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 903
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 904
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 906
a=0;//     :goto_0
a=0;//     return-object v6
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/JsonToBean;->jsonToBFBook(Lorg/json/JSONObject;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static syncUserCoinDetail(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/UserCoinDetailbean;
a=0;//     .locals 10
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 788
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 789
a=0;//     .local v2, "pt":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->getAppVersionCode(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 790
a=0;//     .local v5, "v":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 791
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 792
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/user-user_pay_info?userid=%s&token=%s&v=%s&ct=%s&pt=%s&srcid=%s"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x6
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object p1, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     aput-object p2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object v5, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     aput-object v2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     aput-object v3, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 793
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 794
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 795
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 796
a=0;//     :goto_0
a=0;//     return-object v6
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToUserCoinDetail(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/UserCoinDetailbean;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static syncUserInfo(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 11
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 729
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 730
a=0;//     .local v3, "pt":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 731
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/PhoneUtils;->getMacAddress(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 732
a=0;//     .local v2, "mac":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/utils/CommonUtils;->getAppVersionCode(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 733
a=0;//     .local v6, "v":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 734
a=0;//     .local v4, "srcid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "http://app.2cloo.com/user-info?uid=%s&token=%s&ct=android&data=json&pt=%s&v=%s&imei=%s&mac_address=%s&srcid=%s"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x7
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     aput-object p1, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     aput-object p2, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     aput-object v3, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x3
a=0;// 
a=0;//     aput-object v6, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     aput-object v0, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x5
a=0;// 
a=0;//     aput-object v2, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x6
a=0;// 
a=0;//     aput-object v4, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 736
a=0;//     .local v5, "url":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 737
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 738
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 739
a=0;//     .end local v1    # "json":Lorg/json/JSONObject;
a=0;//     :cond_0
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static syncUserInfoNew(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;//     .locals 10
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 751
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 752
a=0;//     .local v2, "pt":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->getAppVersionCode(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 753
a=0;//     .local v5, "v":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 754
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 755
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/user-user_index?userid=%s&token=%s&v=%s&ct=%s&pt=%s&srcid=%s"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x6
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object p1, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     aput-object p2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object v5, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     aput-object v2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     aput-object v3, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 756
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 757
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 758
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 759
a=0;//     :goto_0
a=0;//     return-object v6
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToUserCenterNewBean(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static syncVipBF(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Vector;
a=0;//     .locals 11
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "token"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 915
a=0;//     #v10=(One);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 916
a=0;//     .local v5, "v":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 917
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 918
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 919
a=0;//     .local v2, "pt":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/book-myvip?uid=%s&token=%s&data=json&page=1&ct=android&pt=%s&v=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x6
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object p1, v8, v9
a=0;// 
a=0;//     aput-object p2, v8, v10
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object v2, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     aput-object v5, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     aput-object v3, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 920
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v10}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 921
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 922
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 924
a=0;//     :goto_0
a=0;//     return-object v6
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/JsonToBean;->jsonToVip(Lorg/json/JSONObject;)Ljava/util/Vector;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static update(Landroid/app/Activity;)Lcom/twocloo/com/cn/beans/Version;
a=0;//     .locals 11
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 325
a=0;//     .local v6, "v":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 326
a=0;//     .local v4, "srcid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 327
a=0;//     .local v1, "imei":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 328
a=0;//     .local v3, "pt":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 329
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "http://app.2cloo.com/ver-android?appid=a01&data=json&v=%s&srcid=%s&ct=%s&pt=%s&imei=%s"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     aput-object v6, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     aput-object v4, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     aput-object v0, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x3
a=0;// 
a=0;//     aput-object v3, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     aput-object v1, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 330
a=0;//     .local v5, "url":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 331
a=0;//     .local v2, "json":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 332
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 333
a=0;//     :goto_0
a=0;//     return-object v7
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToVersion(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Version;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static updateInfo(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 12
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "token"    # Ljava/lang/String;
a=0;//     .param p3, "tel"    # Ljava/lang/String;
a=0;//     .param p4, "email"    # Ljava/lang/String;
a=0;//     .param p5, "username"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 828
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v8}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 829
a=0;//     .local v4, "pt":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 830
a=0;//     .local v7, "v":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 831
a=0;//     .local v5, "srcid":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 833
a=0;//     .local v2, "imei":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "http://app.2cloo.com/user-update_user_info?uid=%s&token=%s&tel=%s&email=%s&ct=android&data=json&pt=%s&v=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/16 v10, 0x9
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     new-array v10, v10, [Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aput-object p1, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     aput-object p2, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     aput-object p3, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     aput-object p4, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x4
a=0;// 
a=0;//     aput-object p5, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x5
a=0;// 
a=0;//     aput-object v4, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x6
a=0;// 
a=0;//     aput-object v7, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x7
a=0;// 
a=0;//     aput-object v2, v10, v11
a=0;// 
a=0;//     const/16 v11, 0x8
a=0;// 
a=0;//     aput-object v5, v10, v11
a=0;// 
a=0;//     invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 834
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 833
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 835
a=0;//     .local v6, "url":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 836
a=0;//     .local v3, "json":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 837
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 848
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v8=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 841
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "code"
a=0;// 
a=0;//     invoke-virtual {v3, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_1
a=0;// 
a=0;//     .line 842
a=0;//     const-string v8, "code"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 843
a=0;//     .local v0, "code":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 845
a=0;//     .end local v0    # "code":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v8=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 846
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 848
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static updateInfo(Landroid/app/Activity;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 11
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "bookList"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 455
a=0;//     #v10=(One);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 456
a=0;//     .local v5, "v":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 457
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 458
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 459
a=0;//     .local v2, "pt":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "http://app.2cloo.com/book-up_info?booklist=%s&data=json&ct=android&v=%s&srcid=%s&imei=%s&pt=%s"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aput-object p1, v8, v9
a=0;// 
a=0;//     aput-object v5, v8, v10
a=0;// 
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aput-object v3, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     aput-object v0, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     aput-object v2, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 460
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v10}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 461
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static updateInfoService(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 10
a=0;//     .param p0, "bookList"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     .line 468
a=0;//     #v9=(One);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 469
a=0;//     .local v5, "v":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 470
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 471
a=0;//     .local v0, "imei":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 472
a=0;//     .local v2, "pt":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "http://app.2cloo.com/book-up_info?booklist=%s&data=json&ct=android&v=%s&srcid=%s&imei=%s&pt=%s"
a=0;// 
a=0;//     const/4 v7, 0x5
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     aput-object p0, v7, v8
a=0;// 
a=0;//     aput-object v5, v7, v9
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     aput-object v3, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     aput-object v0, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     aput-object v2, v7, v8
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 473
a=0;//     .local v4, "url":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v9}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 474
a=0;//     .local v1, "json":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static updatePass(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 13
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "oldPass"    # Ljava/lang/String;
a=0;//     .param p3, "newPass"    # Ljava/lang/String;
a=0;//     .param p4, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 437
a=0;//     invoke-static {p2}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 438
a=0;//     invoke-static/range {p3 .. p3}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p3
a=0;// 
a=0;//     .line 439
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 440
a=0;//     .local v4, "t":J
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/16 v10, 0xa
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v8, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 441
a=0;//     .local v0, "auth":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 442
a=0;//     .local v7, "v":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 443
a=0;//     .local v1, "imei":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 444
a=0;//     .local v3, "srcid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "http://app.2cloo.com/user-ch_passwd?uid=%s&oldpasswdhash=%s&newpass=%s&ct=android&data=json&auth=%s&t=%s&token=%s&v=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/16 v10, 0x9
a=0;// 
a=0;//     new-array v10, v10, [Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aput-object p1, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     aput-object p2, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     aput-object p3, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     aput-object v0, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x4
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v12, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x5
a=0;// 
a=0;//     aput-object p4, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x6
a=0;// 
a=0;//     aput-object v7, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x7
a=0;// 
a=0;//     aput-object v1, v10, v11
a=0;// 
a=0;//     const/16 v11, 0x8
a=0;// 
a=0;//     aput-object v3, v10, v11
a=0;// 
a=0;//     invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 445
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 444
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 446
a=0;//     .local v6, "url":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 448
a=0;//     .local v2, "json":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v2
a=0;// .end method
}}
