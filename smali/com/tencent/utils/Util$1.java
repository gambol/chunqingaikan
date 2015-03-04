package com.tencent.utils; class Util$1 { void a() { int a;
a=0;// .class final Lcom/tencent/utils/Util$1;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/utils/Util;->reportBernoulli(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic b:Landroid/os/Bundle;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 712
a=0;//     iput-object p1, p0, Lcom/tencent/utils/Util$1;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/utils/Util$1;->b:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/utils/Util$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 716
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/utils/Util$1;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "http://cgi.qplus.com/report/report"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/tencent/utils/Util$1;->b:Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/tencent/utils/HttpUtils;->openUrl2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/tencent/utils/Util$Statistic;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 720
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 717
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 718
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
