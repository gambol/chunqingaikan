package net.slidingmenu.tools.b.a.e.f; class c { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/a/e/f/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lnet/slidingmenu/tools/b/b/g/d/g;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static c:Lnet/slidingmenu/tools/b/a/e/f/c;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/e/f/c;);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->b:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/d/b;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/a/d/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lnet/slidingmenu/tools/b/a/d/b;->a(Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/16 v1, 0x48
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     move-object p1, v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(PosByte);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     move-object p1, v0
a=0;// 
a=0;//     #p1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #p1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/k/f;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/k/f;->e()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0x140
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-lt v0, v2, :cond_5
a=0;// 
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(PosByte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v2, v3, :cond_4
a=0;// 
a=0;//     mul-int v1, v2, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/2addr v1, v3
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     if-ne v1, v2, :cond_3
a=0;// 
a=0;//     if-eq v0, v3, :cond_0
a=0;// 
a=0;//     :cond_3
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {p1, v1, v0, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);
a=0;//     move-object p1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(PosByte);v1=(PosByte);v2=(Integer);v4=(Uninit);
a=0;//     mul-int v1, v0, v3
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(Integer);
a=0;//     div-int/2addr v1, v2
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     move v4, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     move v0, v4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v1=(Integer);v2=(One);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(PosByte);v2=(PosShort);v3=(Uninit);v4=(Uninit);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/a/e/f/c;
a=0;//     .locals 2
a=0;// 
a=0;//     const-class v1, Lnet/slidingmenu/tools/b/a/e/f/c;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/e/f/c;->c:Lnet/slidingmenu/tools/b/a/e/f/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/e/f/c;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/e/f/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/e/f/c;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/b/a/e/f/c;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/e/f/c;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/e/f/c;->c:Lnet/slidingmenu/tools/b/a/e/f/c;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/e/f/c;->c:Lnet/slidingmenu/tools/b/a/e/f/c;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lnet/slidingmenu/tools/b/a/e/g/h;Landroid/graphics/Bitmap;)V
a=0;//     .locals 5
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "com.android.launcher.action.INSTALL_SHORTCUT"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.extra.shortcut.NAME"
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/h;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "duplicate"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/h;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/h;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/h;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3, v4}, Lnet/slidingmenu/tools/b/b/k/i;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,Landroid/content/Intent;);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "android.intent.extra.shortcut.INTENT"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
a=0;// 
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     const-string v1, "android.intent.extra.shortcut.ICON"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/h;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/h;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "javascript:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/h;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "(\'"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/h;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "\',"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "0);"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/e/f/a;->a()Lnet/slidingmenu/tools/b/a/e/f/a;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/h;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Lnet/slidingmenu/tools/b/a/e/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Reference,Landroid/content/Intent;);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     const v2, 0x108000a
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Landroid/content/Intent$ShortcutIconResource;->fromContext(Landroid/content/Context;I)Landroid/content/Intent$ShortcutIconResource;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "android.intent.extra.shortcut.ICON_RESOURCE"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->b:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->b:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lnet/slidingmenu/tools/b/a/e/g/h;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/e/g/h;->h()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, v1}, Lnet/slidingmenu/tools/b/a/e/f/c;->a(Lnet/slidingmenu/tools/b/a/e/g/h;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->b:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->b:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->b:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lnet/slidingmenu/tools/b/a/e/g/h;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/e/g/h;->h()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, p2}, Lnet/slidingmenu/tools/b/a/e/f/c;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-direct {p0, v0, v1}, Lnet/slidingmenu/tools/b/a/e/f/c;->a(Lnet/slidingmenu/tools/b/a/e/g/h;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->b:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-direct {p0, v0, p2}, Lnet/slidingmenu/tools/b/a/e/f/c;->a(Lnet/slidingmenu/tools/b/a/e/g/h;Landroid/graphics/Bitmap;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public a(Lnet/slidingmenu/tools/b/a/e/g/h;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/k/k;->h(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/h;->h()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/h;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/h;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->b:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lnet/slidingmenu/tools/b/a/e/f/c;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->b:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/e/f/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/a/d/b;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/a/d/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lnet/slidingmenu/tools/b/a/d/b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0, v2, v1}, Lnet/slidingmenu/tools/b/a/e/f/c;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
