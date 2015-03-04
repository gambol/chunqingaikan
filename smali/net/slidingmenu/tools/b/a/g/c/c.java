package net.slidingmenu.tools.b.a.g.c; class c { void a() { int a;
a=0;// .class Lnet/slidingmenu/tools/b/a/g/c/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Landroid/app/NotificationManager;
a=0;// 
a=0;// .field private c:Landroid/app/Notification;
a=0;// 
a=0;// .field private d:Landroid/app/PendingIntent;
a=0;// 
a=0;// .field private e:Landroid/app/PendingIntent;
a=0;// 
a=0;// .field private f:I
a=0;// 
a=0;// .field private g:Lnet/slidingmenu/tools/b/a/a/a/g;
a=0;// 
a=0;// .field private h:Lnet/slidingmenu/tools/b/a/a/a/a;
a=0;// 
a=0;// .field private i:Ljava/lang/String;
a=0;// 
a=0;// .field private j:Ljava/lang/String;
a=0;// 
a=0;// .field private k:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/e/g/a;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/g/c/c;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput p3, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->f:I
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/a/e/g/a;->f()Lnet/slidingmenu/tools/b/a/a/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->h:Lnet/slidingmenu/tools/b/a/a/a/a;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->h:Lnet/slidingmenu/tools/b/a/a/a/a;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->h:Lnet/slidingmenu/tools/b/a/a/a/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/a/a/a;->g()Lnet/slidingmenu/tools/b/a/a/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->g:Lnet/slidingmenu/tools/b/a/a/a/g;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/g/c/c;->b()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->g:Lnet/slidingmenu/tools/b/a/a/a/g;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/a/a/g;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->g:Lnet/slidingmenu/tools/b/a/a/a/g;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/a/a/g;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->k()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-array v2, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->i()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-array v2, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->j:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->j()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->j:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->j:Ljava/lang/String;
a=0;// 
a=0;//     :cond_3
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c()Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->b:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "notification"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->b:Landroid/app/NotificationManager;
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->b:Landroid/app/NotificationManager;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private c(Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1, p1}, Lnet/slidingmenu/tools/b/b/k/j;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget v3, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->f:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/high16 v4, 0x8000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v2, v3, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->e:Landroid/app/PendingIntent;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->e:Landroid/app/PendingIntent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private d()Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Notification;);
a=0;//     invoke-direct {v1}, Landroid/app/Notification;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v1, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private e()Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->d:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/PendingIntent;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget v3, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->f:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/high16 v4, 0x8000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v2, v3, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->d:Landroid/app/PendingIntent;
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->d:Landroid/app/PendingIntent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a()V
a=0;//     .locals 5
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/g/c/c;->c()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/g/c/c;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/g/c/c;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->d:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     const v1, 0x1080081
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->b:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->f:I
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Notification;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
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
a=0;// .method a(IJ)V
a=0;//     .locals 6
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/g/c/c;->c()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/g/c/c;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/g/c/c;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "% . "
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-wide/16 v4, 0x400
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-long v4, p2, v4
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "KB/s"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->d:Landroid/app/PendingIntent;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v0, v4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     const v1, 0x1080081
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->b:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->f:I
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
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
a=0;// .method a(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/g/c/c;->c()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/g/c/c;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/g/c/c;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->d:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v0, v1, v2, p1, v3}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     const v1, 0x1080082
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->b:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->f:I
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Notification;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
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
a=0;// .method b(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/g/c/c;->c()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/g/c/c;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/b/a/g/c/c;->c(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->j:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->p()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->e:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     const v1, 0x1080082
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->b:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->f:I
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/g/c/c;->c:Landroid/app/Notification;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Notification;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
}}
