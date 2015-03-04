package com.android.volley.toolbox; class JsonObjectRequest { void a() { int a;
a=0;// .class public Lcom/android/volley/toolbox/JsonObjectRequest;
a=0;// .super Lcom/android/volley/toolbox/JsonRequest;
a=0;// .source "JsonObjectRequest.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/android/volley/toolbox/JsonRequest",
a=0;//         "<",
a=0;//         "Lorg/json/JSONObject;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(ILjava/lang/String;Lorg/json/JSONObject;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V
a=0;//     .locals 6
a=0;//     .param p1, "method"    # I
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;//     .param p3, "jsonRequest"    # Lorg/json/JSONObject;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             "Lcom/android/volley/Response$Listener",
a=0;//             "<",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ">;",
a=0;//             "Lcom/android/volley/Response$ErrorListener;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     .local p4, "listener":Lcom/android/volley/Response$Listener;, "Lcom/android/volley/Response$Listener<Lorg/json/JSONObject;>;"
a=0;//     .local p5, "errorListener":Lcom/android/volley/Response$ErrorListener;, "Lcom/android/volley/Response$ErrorListener;"
a=0;//     if-nez p3, :cond_0
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Lcom/android/volley/toolbox/JsonObjectRequest;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Lcom/android/volley/Response$Listener;);
a=0;//     move-object v5, p5
a=0;// 
a=0;//     .line 48
a=0;//     #v5=(Reference,Lcom/android/volley/Response$ErrorListener;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/android/volley/toolbox/JsonRequest;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V
a=0;// 
a=0;//     .line 49
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/JsonObjectRequest;);p0=(Reference,Lcom/android/volley/toolbox/JsonObjectRequest;);
a=0;//     return-void
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);p0=(UninitThis,Lcom/android/volley/toolbox/JsonObjectRequest;);
a=0;//     invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V
a=0;//     .locals 6
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "jsonRequest"    # Lorg/json/JSONObject;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             "Lcom/android/volley/Response$Listener",
a=0;//             "<",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ">;",
a=0;//             "Lcom/android/volley/Response$ErrorListener;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     .local p3, "listener":Lcom/android/volley/Response$Listener;, "Lcom/android/volley/Response$Listener<Lorg/json/JSONObject;>;"
a=0;//     .local p4, "errorListener":Lcom/android/volley/Response$ErrorListener;, "Lcom/android/volley/Response$ErrorListener;"
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Lcom/android/volley/toolbox/JsonObjectRequest;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Lcom/android/volley/Response$Listener;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     .line 60
a=0;//     #v5=(Reference,Lcom/android/volley/Response$ErrorListener;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/android/volley/toolbox/JsonObjectRequest;-><init>(ILjava/lang/String;Lorg/json/JSONObject;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V
a=0;// 
a=0;//     .line 61
a=0;//     #v0=(Reference,Lcom/android/volley/toolbox/JsonObjectRequest;);p0=(Reference,Lcom/android/volley/toolbox/JsonObjectRequest;);
a=0;//     return-void
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);p0=(UninitThis,Lcom/android/volley/toolbox/JsonObjectRequest;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected parseNetworkResponse(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response;
a=0;//     .locals 5
a=0;//     .param p1, "response"    # Lcom/android/volley/NetworkResponse;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/NetworkResponse;",
a=0;//             ")",
a=0;//             "Lcom/android/volley/Response",
a=0;//             "<",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/lang/String;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/String;);
a=0;//     iget-object v3, p1, Lcom/android/volley/NetworkResponse;->data:[B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     iget-object v4, p1, Lcom/android/volley/NetworkResponse;->headers:Ljava/util/Map;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Map;);
a=0;//     invoke-static {v4}, Lcom/android/volley/toolbox/HttpHeaderParser;->parseCharset(Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v2, v3, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     .line 68
a=0;//     .local v2, "jsonString":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 69
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {p1}, Lcom/android/volley/toolbox/HttpHeaderParser;->parseCacheHeaders(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 68
a=0;//     invoke-static {v3, v4}, Lcom/android/volley/Response;->success(Ljava/lang/Object;Lcom/android/volley/Cache$Entry;)Lcom/android/volley/Response;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 73
a=0;//     .end local v2    # "jsonString":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 70
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 71
a=0;//     .local v0, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     new-instance v3, Lcom/android/volley/ParseError;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/android/volley/ParseError;);
a=0;//     invoke-direct {v3, v0}, Lcom/android/volley/ParseError;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/android/volley/ParseError;);
a=0;//     invoke-static {v3}, Lcom/android/volley/Response;->error(Lcom/android/volley/VolleyError;)Lcom/android/volley/Response;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 72
a=0;//     .end local v0    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     :catch_1
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 73
a=0;//     .local v1, "je":Lorg/json/JSONException;
a=0;//     #v1=(Reference,Lorg/json/JSONException;);
a=0;//     new-instance v3, Lcom/android/volley/ParseError;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/android/volley/ParseError;);
a=0;//     invoke-direct {v3, v1}, Lcom/android/volley/ParseError;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/android/volley/ParseError;);
a=0;//     invoke-static {v3}, Lcom/android/volley/Response;->error(Lcom/android/volley/VolleyError;)Lcom/android/volley/Response;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
