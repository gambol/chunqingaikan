package com.tencent.open; class TDialog$THandler { void a() { int a;
a=0;// .class Lcom/tencent/open/TDialog$THandler;
a=0;// .super Landroid/os/Handler;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/open/TDialog;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "THandler"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mL:Lcom/tencent/open/TDialog$OnTimeListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/open/TDialog$OnTimeListener;Landroid/os/Looper;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 107
a=0;//     #p0=(Reference,Lcom/tencent/open/TDialog$THandler;);
a=0;//     iput-object p1, p0, Lcom/tencent/open/TDialog$THandler;->mL:Lcom/tencent/open/TDialog$OnTimeListener;
a=0;// 
a=0;//     .line 108
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     const-string v0, "TAG"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "--handleMessage--msg.WHAT = "
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
a=0;//     .line 113
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 143
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 115
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/TDialog$THandler;->mL:Lcom/tencent/open/TDialog$OnTimeListener;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/tencent/open/TDialog$OnTimeListener;->access$000(Lcom/tencent/open/TDialog$OnTimeListener;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 119
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TDialog$THandler;->mL:Lcom/tencent/open/TDialog$OnTimeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TDialog$OnTimeListener;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/open/TDialog$OnTimeListener;->onCancel()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 125
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/tencent/open/TDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/open/TDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     invoke-static {}, Lcom/tencent/open/TDialog;->a()Ljava/lang/ref/WeakReference;
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
a=0;//     invoke-static {v0, v1}, Lcom/tencent/open/TDialog;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 130
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/tencent/open/TDialog;->b()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/open/TDialog;->b()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 131
a=0;//     invoke-static {}, Lcom/tencent/open/TDialog;->b()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 135
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/tencent/open/TDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/open/TDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 136
a=0;//     invoke-static {}, Lcom/tencent/open/TDialog;->a()Ljava/lang/ref/WeakReference;
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
a=0;//     invoke-static {v0, v1}, Lcom/tencent/open/TDialog;->b(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 113
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// .end method
}}
