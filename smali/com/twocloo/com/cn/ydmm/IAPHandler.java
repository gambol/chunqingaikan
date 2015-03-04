package com.twocloo.com.cn.ydmm; class IAPHandler { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/ydmm/IAPHandler;
a=0;// .super Landroid/os/Handler;
a=0;// .source "IAPHandler.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final BILL_FINISH:I = 0x2711
a=0;// 
a=0;// .field public static final INIT_FINISH:I = 0x2710
a=0;// 
a=0;// .field public static final QUERY_FINISH:I = 0x2712
a=0;// 
a=0;// .field public static final UNSUB_FINISH:I = 0x2713
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 21
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     .line 22
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/ydmm/IAPHandler;);
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/ydmm/IAPHandler;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 23
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initShow(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u521d\u59cb\u5316\uff1a"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 2
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 28
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 29
a=0;//     .local v0, "what":I
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 37
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 31
a=0;//     :pswitch_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/com/cn/ydmm/IAPHandler;->initShow(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 29
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2710
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public showDialog(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "title"    # Ljava/lang/String;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/ydmm/IAPHandler;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 46
a=0;//     .local v0, "builder":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/ydmm/IAPHandler;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->icon:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 48
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     const-string p2, "Undefined error"
a=0;// 
a=0;//     .end local p2    # "msg":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 49
a=0;//     const-string v1, "OK"
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/ydmm/IAPHandler$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/ydmm/IAPHandler$1;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/ydmm/IAPHandler$1;-><init>(Lcom/twocloo/com/cn/ydmm/IAPHandler;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/ydmm/IAPHandler$1;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 54
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
}}
