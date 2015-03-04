package net.slidingmenu.tools.st; class i { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/st/i;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Z
a=0;// 
a=0;// .field b:Landroid/content/Context;
a=0;// 
a=0;// .field c:Lnet/slidingmenu/tools/st/slidingbzxc;
a=0;// 
a=0;// .field d:Lnet/slidingmenu/tools/st/slidingbyxc;
a=0;// 
a=0;// .field e:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lnet/slidingmenu/tools/st/slidingbzxc;Landroid/content/Context;ZLnet/slidingmenu/tools/st/slidingbyxc;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/st/i;);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/st/i;->a:Z
a=0;// 
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/st/i;->e:Z
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/st/i;->c:Lnet/slidingmenu/tools/st/slidingbzxc;
a=0;// 
a=0;//     iput-object p2, p0, Lnet/slidingmenu/tools/st/i;->b:Landroid/content/Context;
a=0;// 
a=0;//     iput-boolean p3, p0, Lnet/slidingmenu/tools/st/i;->a:Z
a=0;// 
a=0;//     iput-object p4, p0, Lnet/slidingmenu/tools/st/i;->d:Lnet/slidingmenu/tools/st/slidingbyxc;
a=0;// 
a=0;//     iput-boolean p5, p0, Lnet/slidingmenu/tools/st/i;->e:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected varargs a([Ljava/lang/Void;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/st/i;->c:Lnet/slidingmenu/tools/st/slidingbzxc;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/st/slidingbzxc;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/st/i;->c:Lnet/slidingmenu/tools/st/slidingbzxc;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Lnet/slidingmenu/tools/st/slidingbzxc;->setLoading(Z)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "scid="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/st/i;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/b/c/c/a;->h(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
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
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/d/j;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/st/i;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-boolean v3, p0, Lnet/slidingmenu/tools/st/i;->e:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v2, v1, v3}, Lnet/slidingmenu/tools/d/a/b;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-boolean v1, p0, Lnet/slidingmenu/tools/st/i;->e:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x14
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v1, v2, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     const-string v1, "SDKChecking"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "ad resource request failed"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v2, "c"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
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
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     const-string v1, "Ad request succeed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/c/b/a;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/st/i;->b:Landroid/content/Context;
a=0;// 
a=0;//     sget-object v2, Lnet/slidingmenu/tools/st/slidingbzxc;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
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
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/st/i;->c:Lnet/slidingmenu/tools/st/slidingbzxc;
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/st/i;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lnet/slidingmenu/tools/st/slidingbzxc;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/st/i;->c:Lnet/slidingmenu/tools/st/slidingbzxc;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/st/slidingbzxc;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/st/i;->c:Lnet/slidingmenu/tools/st/slidingbzxc;
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Lnet/slidingmenu/tools/st/slidingbzxc;->setLoading(Z)V
a=0;// 
a=0;//     :cond_3
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v1=(Integer);v2=(Boolean);v3=(Byte);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/d/a/f;->a(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "Ad request result code:%d, %s"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v1, v4, v5
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aput-object v2, v4, v1
a=0;// 
a=0;//     invoke-static {v3, v4}, Lnet/slidingmenu/tools/b/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected a(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/st/i;->d:Lnet/slidingmenu/tools/st/slidingbyxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/st/slidingbyxc;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/st/i;->d:Lnet/slidingmenu/tools/st/slidingbyxc;
a=0;// 
a=0;//     invoke-interface {v0}, Lnet/slidingmenu/tools/st/slidingbyxc;->slibssd()V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/st/i;->c:Lnet/slidingmenu/tools/st/slidingbzxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/st/slidingbzxc;);
a=0;//     iput-object p1, v0, Lnet/slidingmenu/tools/st/slidingbzxc;->e:Ljava/lang/String;
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/st/i;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/st/i;->c:Lnet/slidingmenu/tools/st/slidingbzxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/st/slidingbzxc;);
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/st/slidingbzxc;->a(I)Z
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/st/i;->c:Lnet/slidingmenu/tools/st/slidingbzxc;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/st/i;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/st/i;->d:Lnet/slidingmenu/tools/st/slidingbyxc;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/st/slidingbyxc;);
a=0;//     invoke-virtual {v0, v1, v2}, Lnet/slidingmenu/tools/st/slidingbzxc;->a(Landroid/content/Context;Lnet/slidingmenu/tools/st/slidingbyxc;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected b(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/st/i;->c:Lnet/slidingmenu/tools/st/slidingbzxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/st/slidingbzxc;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/st/i;->c:Lnet/slidingmenu/tools/st/slidingbzxc;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/st/slidingbzxc;->setLoading(Z)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
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
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/st/i;->a([Ljava/lang/Void;)Ljava/lang/String;
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
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/st/i;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/st/i;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
