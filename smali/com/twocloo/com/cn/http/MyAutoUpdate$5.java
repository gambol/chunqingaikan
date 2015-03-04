package com.twocloo.com.cn.http; class MyAutoUpdate$5 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/http/MyAutoUpdate$5;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MyAutoUpdate.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/http/MyAutoUpdate;->forceshowUpdateDialog()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/http/MyAutoUpdate;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate$5;->this$0:Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;// 
a=0;//     .line 145
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate$5;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/http/MyAutoUpdate$5;)Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate$5;->this$0:Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/content/DialogInterface;I)V
a=0;//     .locals 5
a=0;//     .param p1, "dialog"    # Landroid/content/DialogInterface;
a=0;//     .param p2, "which"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 148
a=0;//     #v4=(Null);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate$5;->this$0:Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->access$0(Lcom/twocloo/com/cn/http/MyAutoUpdate;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-class v3, Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 149
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "url"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate$5;->this$0:Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->access$1(Lcom/twocloo/com/cn/http/MyAutoUpdate;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate$5;->this$0:Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->access$0(Lcom/twocloo/com/cn/http/MyAutoUpdate;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/app/Activity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 152
a=0;//     new-instance v1, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/ProgressDialog;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate$5;->this$0:Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->access$0(Lcom/twocloo/com/cn/http/MyAutoUpdate;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 153
a=0;//     .local v1, "pd":Landroid/app/ProgressDialog;
a=0;//     #v1=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v1, v4}, Landroid/app/ProgressDialog;->setProgressStyle(I)V
a=0;// 
a=0;//     .line 154
a=0;//     const-string v2, "\u66f4\u65b0\u63d0\u793a"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 155
a=0;//     const-string v2, "\u6b63\u5728\u4e0b\u8f7d\u4e2d\uff0c\u8bf7\u7a0d\u7b49....."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 156
a=0;//     invoke-virtual {v1, v4}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V
a=0;// 
a=0;//     .line 157
a=0;//     invoke-virtual {v1, v4}, Landroid/app/ProgressDialog;->setInverseBackgroundForced(Z)V
a=0;// 
a=0;//     .line 158
a=0;//     invoke-virtual {v1, v4}, Landroid/app/ProgressDialog;->setCancelable(Z)V
a=0;// 
a=0;//     .line 160
a=0;//     new-instance v2, Lcom/twocloo/com/cn/http/MyAutoUpdate$5$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/http/MyAutoUpdate$5$1;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/http/MyAutoUpdate$5$1;-><init>(Lcom/twocloo/com/cn/http/MyAutoUpdate$5;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate$5$1;);
a=0;//     invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V
a=0;// 
a=0;//     .line 187
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     .line 189
a=0;//     return-void
a=0;// .end method
}}
