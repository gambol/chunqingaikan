package com.twocloooo; class DevNativeActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloooo/DevNativeActivity$1;
a=0;// .super Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloooo/DevNativeActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/twocloooo/DevNativeActivity$1;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/DevNativeActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sparse-switch v0, :sswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :sswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "toast"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/DevNativeActivity$1;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeActivity;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/DevNativeActivity$1;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloooo/DevNativeActivity;->a(Lcom/twocloooo/DevNativeActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "%"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloooo/DevNativeActivity$1;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeActivity;->b(Lcom/twocloooo/DevNativeActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/DevNativeActivity$1;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeActivity;->a(Lcom/twocloooo/DevNativeActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "0%"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_1
a=0;//         0x1 -> :sswitch_2
a=0;//         0x7 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
}}
