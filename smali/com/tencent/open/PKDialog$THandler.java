package com.tencent.open; class PKDialog$THandler { void a() { int a;
a=0;// .class Lcom/tencent/open/PKDialog$THandler;
a=0;// .super Landroid/os/Handler;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/open/PKDialog;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "THandler"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mL:Lcom/tencent/open/PKDialog$OnTimeListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/open/PKDialog$OnTimeListener;Landroid/os/Looper;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 419
a=0;//     invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 420
a=0;//     #p0=(Reference,Lcom/tencent/open/PKDialog$THandler;);
a=0;//     iput-object p1, p0, Lcom/tencent/open/PKDialog$THandler;->mL:Lcom/tencent/open/PKDialog$OnTimeListener;
a=0;// 
a=0;//     .line 421
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 425
a=0;//     const-string v0, "PKDialog"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "msg = "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 426
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 457
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 428
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/tencent/open/PKDialog$THandler;->mL:Lcom/tencent/open/PKDialog$OnTimeListener;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/tencent/open/PKDialog$OnTimeListener;->access$700(Lcom/tencent/open/PKDialog$OnTimeListener;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 432
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/tencent/open/PKDialog$THandler;->mL:Lcom/tencent/open/PKDialog$OnTimeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/PKDialog$OnTimeListener;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/PKDialog$OnTimeListener;->onCancel()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 438
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/tencent/open/PKDialog;->access$400()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/open/PKDialog;->access$400()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 439
a=0;//     invoke-static {}, Lcom/tencent/open/PKDialog;->access$400()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/open/PKDialog;->access$800(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 449
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/tencent/open/PKDialog;->access$400()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/open/PKDialog;->access$400()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 450
a=0;//     invoke-static {}, Lcom/tencent/open/PKDialog;->access$400()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/open/PKDialog;->access$900(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 426
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_0
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// .end method
}}
