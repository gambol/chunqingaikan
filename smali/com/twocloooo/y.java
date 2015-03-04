package com.twocloooo; class y { void a() { int a;
a=0;// .class Lcom/twocloooo/y;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/twocloooo/v;
a=0;// 
a=0;// .field private final synthetic b:Landroid/app/AlertDialog;
a=0;// 
a=0;// .field private final synthetic c:Lcom/twocloooo/ay;
a=0;// 
a=0;// .field private final synthetic d:Landroid/content/Context;
a=0;// 
a=0;// .field private final synthetic e:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloooo/v;Landroid/app/AlertDialog;Lcom/twocloooo/ay;Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/twocloooo/y;->a:Lcom/twocloooo/v;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloooo/y;->b:Landroid/app/AlertDialog;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloooo/y;->c:Lcom/twocloooo/ay;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/twocloooo/y;->d:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/twocloooo/y;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/y;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/y;->b:Landroid/app/AlertDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/AlertDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/y;->c:Lcom/twocloooo/ay;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/twocloooo/ay;->l:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/twocloooo/be;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "/download/"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloooo/y;->c:Lcom/twocloooo/ay;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/twocloooo/ay;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ".apk"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "application/vnd.android.package-archive"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/y;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloooo/y;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "xp_click"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/y;->c:Lcom/twocloooo/ay;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/ay;);
a=0;//     iget-object v2, v2, Lcom/twocloooo/ay;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloooo/y;->c:Lcom/twocloooo/ay;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloooo/ay;);
a=0;//     iget-object v3, v3, Lcom/twocloooo/ay;->g:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloooo/y;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3, v4}, Lcom/twocloooo/bg;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloooo/y;->c:Lcom/twocloooo/ay;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/ay;);
a=0;//     iget-object v0, v0, Lcom/twocloooo/ay;->l:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/y;->a:Lcom/twocloooo/v;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/v;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/y;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/y;->c:Lcom/twocloooo/ay;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/ay;);
a=0;//     iget-object v3, p0, Lcom/twocloooo/y;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/twocloooo/v;->a(Lcom/twocloooo/v;Landroid/content/Context;Lcom/twocloooo/ay;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
