package com.twocloo.com.cn.http; class MyAutoUpdate$3 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/http/MyAutoUpdate$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MyAutoUpdate.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/http/MyAutoUpdate;->showSingleUpdateDialog()V
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
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate$3;->this$0:Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;// 
a=0;//     .line 124
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/content/DialogInterface;I)V
a=0;//     .locals 3
a=0;//     .param p1, "dialog"    # Landroid/content/DialogInterface;
a=0;//     .param p2, "which"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate$3;->this$0:Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/MyAutoUpdate;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->access$0(Lcom/twocloo/com/cn/http/MyAutoUpdate;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/twocloo/com/cn/http/UpdateAPKService;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 127
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "url"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate$3;->this$0:Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->access$1(Lcom/twocloo/com/cn/http/MyAutoUpdate;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/http/MyAutoUpdate$3;->this$0:Lcom/twocloo/com/cn/http/MyAutoUpdate;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/http/MyAutoUpdate;->access$0(Lcom/twocloo/com/cn/http/MyAutoUpdate;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/Activity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 129
a=0;//     return-void
a=0;// .end method
}}
