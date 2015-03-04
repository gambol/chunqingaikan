package com.twocloooo; class k { void a() { int a;
a=0;// .class Lcom/twocloooo/k;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Ljava/lang/String;
a=0;// 
a=0;// .field b:Ljava/lang/String;
a=0;// 
a=0;// .field c:Lcom/twocloooo/ay;
a=0;// 
a=0;// .field final synthetic d:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloooo/DevNativeService;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Lcom/twocloooo/k;->d:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/k;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloooo/k;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloooo/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/twocloooo/k;)Lcom/twocloooo/DevNativeService;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/k;->d:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloooo/k;->d:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->e(Lcom/twocloooo/DevNativeService;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloooo/DevNativeService;->d()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloooo/k;->d:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     const-string v1, "float_click"
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloooo/k;->c:Lcom/twocloooo/ay;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloooo/ay;);
a=0;//     iget-object v5, v5, Lcom/twocloooo/ay;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloooo/k;->c:Lcom/twocloooo/ay;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloooo/ay;);
a=0;//     iget-object v6, v6, Lcom/twocloooo/ay;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1, v5, v6, v4}, Lcom/twocloooo/bg;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/k;->d:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/DevNativeService;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v1, v0, :cond_3
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/k;->d:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/DevNativeService;->k(Lcom/twocloooo/DevNativeService;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloooo/be;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, "/download"
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, p0, Lcom/twocloooo/k;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, ".apk"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/k;->d:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcom/twocloooo/bm;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.action.VIEW"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const/high16 v2, 0x10000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "application/vnd.android.package-archive"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/k;->d:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloooo/DevNativeService;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/util/Iterator;);v2=(Null);v5=(Conflicted);v6=(Uninit);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloooo/ay;
a=0;// 
a=0;//     iget-object v5, v0, Lcom/twocloooo/ay;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/twocloooo/ay;->b:Ljava/lang/Integer;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloooo/ay;->g:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloooo/k;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloooo/ay;->h:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloooo/k;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloooo/k;->c:Lcom/twocloooo/ay;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Integer);v5=(Reference,Ljava/util/List;);v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloooo/k;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/k;->d:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/DevNativeService;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/k;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "ssp"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/k;->d:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloooo/DevNativeService;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Null);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/io/File;);v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloooo/k;->d:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     invoke-static {v0, v3}, Lcom/twocloooo/DevNativeService;->b(Lcom/twocloooo/DevNativeService;Z)V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/twocloooo/l;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloooo/l;);
a=0;//     invoke-direct {v1, p0, v4}, Lcom/twocloooo/l;-><init>(Lcom/twocloooo/k;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/l;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Null);
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_2
a=0;// .end method
}}
