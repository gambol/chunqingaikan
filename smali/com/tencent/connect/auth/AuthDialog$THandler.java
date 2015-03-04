package com.tencent.connect.auth; class AuthDialog$THandler { void a() { int a;
a=0;// .class Lcom/tencent/connect/auth/AuthDialog$THandler;
a=0;// .super Landroid/os/Handler;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/connect/auth/AuthDialog;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "THandler"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;Landroid/os/Looper;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 109
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/AuthDialog$THandler;);
a=0;//     iput-object p1, p0, Lcom/tencent/connect/auth/AuthDialog$THandler;->a:Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;// 
a=0;//     .line 110
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 132
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 116
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog$THandler;->a:Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->a(Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 120
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$THandler;->a:Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->onCancel()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 126
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->a()Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 127
a=0;//     invoke-static {}, Lcom/tencent/connect/auth/AuthDialog;->a()Ljava/lang/ref/WeakReference;
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
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/connect/auth/AuthDialog;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 114
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
}}
