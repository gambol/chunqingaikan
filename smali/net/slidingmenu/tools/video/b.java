package net.slidingmenu.tools.video; class b { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/video/b;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/content/Context;
a=0;// 
a=0;// .field b:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;// .field c:Lnet/slidingmenu/tools/video/slidingcdxc;
a=0;// 
a=0;// .field private d:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lnet/slidingmenu/tools/video/slidingccxc;Landroid/content/Context;ZZLnet/slidingmenu/tools/video/slidingcdxc;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/video/b;);
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/video/b;->b:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     iput-object p2, p0, Lnet/slidingmenu/tools/video/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-boolean p4, p0, Lnet/slidingmenu/tools/video/b;->d:Z
a=0;// 
a=0;//     iput-object p5, p0, Lnet/slidingmenu/tools/video/b;->c:Lnet/slidingmenu/tools/video/slidingcdxc;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected varargs a([Ljava/lang/Void;)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/b;->b:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/slidingccxc;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, v1, Lnet/slidingmenu/tools/video/slidingccxc;->a:Z
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lnet/slidingmenu/tools/d/a/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "c"
a=0;// 
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "request video ad data success"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/c/b/a;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/b;->b:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/video/slidingccxc;);
a=0;//     iget-object v2, v2, Lnet/slidingmenu/tools/video/slidingccxc;->b:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "lastRequestTime"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/b;->b:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/b;->a:Landroid/content/Context;
a=0;// 
a=0;//     iget-boolean v3, p0, Lnet/slidingmenu/tools/video/b;->d:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v1, v2, v0, v3}, Lnet/slidingmenu/tools/video/slidingccxc;->a(Landroid/content/Context;Ljava/lang/String;Z)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/b;->c:Lnet/slidingmenu/tools/video/slidingcdxc;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/b;->c:Lnet/slidingmenu/tools/video/slidingcdxc;
a=0;// 
a=0;//     invoke-interface {v1}, Lnet/slidingmenu/tools/video/slidingcdxc;->slibrsd()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/b;->b:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/slidingccxc;);
a=0;//     iput-boolean v5, v1, Lnet/slidingmenu/tools/video/slidingccxc;->a:Z
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v1=(Integer);v2=(Boolean);v3=(Byte);v4=(Uninit);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "request video ad data fail. error code :"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/b/c/b/a;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/b;->c:Lnet/slidingmenu/tools/video/slidingcdxc;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/b;->c:Lnet/slidingmenu/tools/video/slidingcdxc;
a=0;// 
a=0;//     invoke-interface {v2, v1}, Lnet/slidingmenu/tools/video/slidingcdxc;->slibqsd(I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected a(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected b(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/os/AsyncTask;->onCancelled(Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/video/b;->a([Ljava/lang/Void;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic onCancelled(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/video/b;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/video/b;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
