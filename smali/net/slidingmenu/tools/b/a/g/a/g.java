package net.slidingmenu.tools.b.a.g.a; class g { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/a/g/a/g;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final a:Ljava/lang/String;
a=0;// 
a=0;// .field public static final b:Ljava/lang/String;
a=0;// 
a=0;// .field public static final c:Ljava/lang/String;
a=0;// 
a=0;// .field private static d:I
a=0;// 
a=0;// .field private static e:Landroid/app/PendingIntent;
a=0;// 
a=0;// .field private static f:I
a=0;// 
a=0;// .field private static g:Landroid/app/PendingIntent;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/g/a/g;->d:I
a=0;// 
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/g/a/g;->f:I
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/g/a/g;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/g/a/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/g/a/g;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/g/a/g;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/g/a/g;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/g/a/g;->c:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static final a()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "a2U9dn73sdLs"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "545c094f4959110f5e4b025d194a1555444c4c42590a585b5754"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lnet/slidingmenu/tools/b/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/a/g;->b(Landroid/content/Context;)V
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/a/g;->c(Landroid/content/Context;)V
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/a/g;->d(Landroid/content/Context;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;J)V
a=0;//     .locals 7
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/o;->e(Landroid/content/Context;)Landroid/app/AlarmManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/AlarmManager;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/a/g;->e(Landroid/content/Context;)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/PendingIntent;);
a=0;//     move-wide v4, p1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;JJ)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {p0, p1, p2}, Lnet/slidingmenu/tools/b/a/g/a/g;->a(Landroid/content/Context;J)V
a=0;// 
a=0;//     invoke-static {p0, p3, p4}, Lnet/slidingmenu/tools/b/a/g/a/g;->b(Landroid/content/Context;J)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/g/a/b/b;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/32 v4, 0x36ee80
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/g/a/b/b;);
a=0;//     invoke-static/range {v0 .. v5}, Lnet/slidingmenu/tools/b/a/g/a/g;->a(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/g/a/b/b;JJ)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/g/a/b/b;JJ)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {p0, p1}, Lnet/slidingmenu/tools/b/a/g/a/g;->b(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/g/a/b/b;)V
a=0;// 
a=0;//     invoke-static {p0, p2, p3, p4, p5}, Lnet/slidingmenu/tools/b/a/g/a/g;->a(Landroid/content/Context;JJ)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static final b()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "a2U9dn73sdLc"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "0256584b1f5e435f0d1c50564c5b5e5645014c405c5f0f5b085f"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lnet/slidingmenu/tools/b/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/o;->e(Landroid/content/Context;)Landroid/app/AlarmManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/AlarmManager;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/a/g;->e(Landroid/content/Context;)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;J)V
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/o;->e(Landroid/content/Context;)Landroid/app/AlarmManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/AlarmManager;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v2, p1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/a/g;->f(Landroid/content/Context;)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/g/a/b/b;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lnet/slidingmenu/tools/slidingbjxc;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     sget-object v1, Lnet/slidingmenu/tools/b/a/g/a/g;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "AdData"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static final c()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "a2U9dn73sdLa"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "555b5f1f185a10080a1b53551d59065d46534b5b1b4758095e5b5b53"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lnet/slidingmenu/tools/b/c/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static c(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/o;->e(Landroid/content/Context;)Landroid/app/AlarmManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/AlarmManager;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/a/g;->f(Landroid/content/Context;)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static d(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/c/d;->a(Landroid/content/Context;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static e(Landroid/content/Context;)Landroid/app/PendingIntent;
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/g/a/g;->e:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/PendingIntent;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lnet/slidingmenu/tools/slidingbjxc;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     sget-object v1, Lnet/slidingmenu/tools/b/a/g/a/g;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/a/g;->g(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v2, 0x10000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p0, v1, v0, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/g/a/g;->e:Landroid/app/PendingIntent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/g/a/g;->e:Landroid/app/PendingIntent;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static f(Landroid/content/Context;)Landroid/app/PendingIntent;
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/g/a/g;->g:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/PendingIntent;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lnet/slidingmenu/tools/slidingbjxc;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     sget-object v1, Lnet/slidingmenu/tools/b/a/g/a/g;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/a/g;->h(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v2, 0x10000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p0, v1, v0, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lnet/slidingmenu/tools/b/a/g/a/g;->g:Landroid/app/PendingIntent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/g/a/g;->g:Landroid/app/PendingIntent;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static g(Landroid/content/Context;)I
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     sget v0, Lnet/slidingmenu/tools/b/a/g/a/g;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v4, v0, :cond_1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->f(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/e;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x9
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/g/a/g;->d:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     sget v0, Lnet/slidingmenu/tools/b/a/g/a/g;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v4, v0, :cond_1
a=0;// 
a=0;//     const/16 v0, 0x572a
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/g/a/g;->d:I
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     sget v0, Lnet/slidingmenu/tools/b/a/g/a/g;->d:I
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static h(Landroid/content/Context;)I
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     sget v1, Lnet/slidingmenu/tools/b/a/g/a/g;->f:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/a/g;->g(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     sput v0, Lnet/slidingmenu/tools/b/a/g/a/g;->f:I
a=0;// 
a=0;//     :cond_0
a=0;//     sget v0, Lnet/slidingmenu/tools/b/a/g/a/g;->f:I
a=0;// 
a=0;//     return v0
a=0;// .end method
}}
