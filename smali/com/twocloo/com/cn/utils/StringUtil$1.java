package com.twocloo.com.cn.utils; class StringUtil$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/utils/StringUtil$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "StringUtil.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/utils/StringUtil;->toastMessage(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final synthetic val$activity:Landroid/app/Activity;
a=0;// 
a=0;// .field private final synthetic val$message:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/utils/StringUtil$1;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/utils/StringUtil$1;->val$message:Ljava/lang/String;
a=0;// 
a=0;//     .line 478
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/StringUtil$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 482
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/StringUtil;->access$0()Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 483
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/StringUtil;->access$0()Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V
a=0;// 
a=0;//     .line 484
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/utils/StringUtil;->access$1(Landroid/widget/Toast;)V
a=0;// 
a=0;//     .line 486
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/utils/StringUtil$1;->val$activity:Landroid/app/Activity;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/utils/StringUtil$1;->val$message:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/utils/StringUtil;->access$1(Landroid/widget/Toast;)V
a=0;// 
a=0;//     .line 487
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/StringUtil;->access$0()Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 488
a=0;//     return-void
a=0;// .end method
}}
