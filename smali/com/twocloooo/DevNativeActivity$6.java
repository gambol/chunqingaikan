package com.twocloooo; class DevNativeActivity$6 { void a() { int a;
a=0;// .class Lcom/twocloooo/DevNativeActivity$6;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnKeyListener;
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
a=0;//     iput-object p1, p0, Lcom/twocloooo/DevNativeActivity$6;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/DevNativeActivity$6;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne p2, v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/DevNativeActivity$6;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/DevNativeActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloooo/DevNativeActivity;->d(Lcom/twocloooo/DevNativeActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "ad"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, " "
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "li"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " "
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "st.p"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " "
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "hp"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/DevNativeActivity$6;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/DevNativeActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloooo/DevNativeActivity;->e(Lcom/twocloooo/DevNativeActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "ca"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, " "
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "rdvi"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " "
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "ew.ph"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " "
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "p"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/DevNativeActivity$6;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/DevNativeActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloooo/DevNativeActivity;->f(Lcom/twocloooo/DevNativeActivity;)Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/webkit/WebView;->reload()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(One);v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloooo/DevNativeActivity$6;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeActivity;->f(Lcom/twocloooo/DevNativeActivity;)Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/DevNativeActivity$6;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeActivity;->f(Lcom/twocloooo/DevNativeActivity;)Landroid/webkit/WebView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/DevNativeActivity$6;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeActivity;->g(Lcom/twocloooo/DevNativeActivity;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/DevNativeActivity$6;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeActivity;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloooo/DevNativeActivity;->a(Lcom/twocloooo/DevNativeActivity;I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/DevNativeActivity$6;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeActivity;->h(Lcom/twocloooo/DevNativeActivity;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Boolean);
a=0;//     iget-object v0, p0, Lcom/twocloooo/DevNativeActivity$6;->a:Lcom/twocloooo/DevNativeActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeActivity;->i(Lcom/twocloooo/DevNativeActivity;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}
