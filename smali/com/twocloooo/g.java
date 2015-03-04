package com.twocloooo; class g { void a() { int a;
a=0;// .class Lcom/twocloooo/g;
a=0;// .super Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloooo/DevNativeService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/twocloooo/g;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/g;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "toast"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
