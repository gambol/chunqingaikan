package com.chinaMobile; class i { void a() { int a;
a=0;// .class final Lcom/chinaMobile/i;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final synthetic a:Landroid/content/Context;
a=0;// 
a=0;// .field private final synthetic b:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic c:Ljava/lang/String;
a=0;// 
a=0;// .field private final synthetic d:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/chinaMobile/i;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/chinaMobile/i;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/chinaMobile/i;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/chinaMobile/i;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/chinaMobile/i;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     iget-object v0, p0, Lcom/chinaMobile/i;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/chinaMobile/g;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     iget-object v2, p0, Lcom/chinaMobile/i;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v3, "pid"
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v3, "protocolVersion"
a=0;// 
a=0;//     const-string v4, "3.1.4"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v3, "sdkVersion"
a=0;// 
a=0;//     const-string v4, "3.2.1.1"
a=0;// 
a=0;//     invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v3, "cid"
a=0;// 
a=0;//     invoke-virtual {v1, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "deviceId"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/chinaMobile/i;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/chinaMobile/g;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "appKey"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/chinaMobile/i;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/chinaMobile/g;->i(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "packageName"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/chinaMobile/i;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/chinaMobile/g;->k(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "versionCode"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/chinaMobile/i;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/chinaMobile/g;->n(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "versionName"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/chinaMobile/i;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcom/chinaMobile/g;->o(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "sendTime"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v1, v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "userAge"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/chinaMobile/i;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "userSex"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/chinaMobile/i;->d:Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "userFeedback"
a=0;// 
a=0;//     const-string v3, "UTF-8"
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "uuid"
a=0;// 
a=0;//     invoke-static {}, Lcom/chinaMobile/MobileAgent;->access$1()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/chinaMobile/i;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "http://da.mmarket.com/mmsdk/mmsdk?func=mmsdk:feedback"
a=0;// 
a=0;//     invoke-static {v0, v2, v1}, Lcom/chinaMobile/MobileAgent;->access$2(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v5, :cond_0
a=0;// 
a=0;//     const-string v0, "MobileAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "send feedback success"
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
}}
