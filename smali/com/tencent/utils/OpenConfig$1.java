package com.tencent.utils; class OpenConfig$1 { void a() { int a;
a=0;// .class Lcom/tencent/utils/OpenConfig$1;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/utils/OpenConfig;->b()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/os/Bundle;
a=0;// 
a=0;// .field final synthetic b:Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/utils/OpenConfig;Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     iput-object p1, p0, Lcom/tencent/utils/OpenConfig$1;->b:Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/utils/OpenConfig$1;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/utils/OpenConfig$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/utils/OpenConfig$1;->b:Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/OpenConfig;);
a=0;//     invoke-static {v0}, Lcom/tencent/utils/OpenConfig;->a(Lcom/tencent/utils/OpenConfig;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "http://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/tencent/utils/OpenConfig$1;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/tencent/utils/HttpUtils;->openUrl2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/tencent/utils/Util$Statistic;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v0, v0, Lcom/tencent/utils/Util$Statistic;->response:Ljava/lang/String;
a=0;// 
a=0;//     .line 200
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v1, p0, Lcom/tencent/utils/OpenConfig$1;->b:Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/tencent/utils/OpenConfig;->a(Lcom/tencent/utils/OpenConfig;Lorg/json/JSONObject;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 205
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/utils/OpenConfig$1;->b:Lcom/tencent/utils/OpenConfig;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/utils/OpenConfig;->a(Lcom/tencent/utils/OpenConfig;I)I
a=0;// 
a=0;//     .line 206
a=0;//     return-void
a=0;// 
a=0;//     .line 202
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 203
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
