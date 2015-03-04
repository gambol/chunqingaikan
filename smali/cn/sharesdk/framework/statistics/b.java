package cn.sharesdk.framework.statistics; class b { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/statistics/b;
a=0;// .super Lcn/sharesdk/framework/l;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static b:Lcn/sharesdk/framework/statistics/b;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private c:Landroid/content/Context;
a=0;// 
a=0;// .field private d:Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;// .field private e:Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;// .field private f:Ljava/lang/String;
a=0;// 
a=0;// .field private g:Landroid/os/Handler;
a=0;// 
a=0;// .field private h:Z
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// .field private j:Z
a=0;// 
a=0;// .field private k:J
a=0;// 
a=0;// .field private l:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Thread-"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, -0x6ab5
a=0;// 
a=0;//     #v1=(Short);
a=0;//     invoke-static {v1}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcn/sharesdk/framework/l;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/statistics/b;);
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/statistics/b;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/statistics/b;->d:Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/statistics/a;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/statistics/b;->e:Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/b;
a=0;//     .locals 3
a=0;// 
a=0;//     const-class v1, Lcn/sharesdk/framework/statistics/b;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcn/sharesdk/framework/statistics/b;->b:Lcn/sharesdk/framework/statistics/b;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/b;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);
a=0;//     new-instance v0, Lcn/sharesdk/framework/statistics/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/statistics/b;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Lcn/sharesdk/framework/statistics/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/b;);
a=0;//     sput-object v0, Lcn/sharesdk/framework/statistics/b;->b:Lcn/sharesdk/framework/statistics/b;
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v0, Lcn/sharesdk/framework/statistics/b;->b:Lcn/sharesdk/framework/statistics/b;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Lcn/sharesdk/framework/statistics/b/c;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->d:Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/b;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p1, Lcn/sharesdk/framework/statistics/b/c;->f:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->f:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p1, Lcn/sharesdk/framework/statistics/b/c;->g:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->d:Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->r()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p1, Lcn/sharesdk/framework/statistics/b/c;->h:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->d:Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->t()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p1, Lcn/sharesdk/framework/statistics/b/c;->i:I
a=0;// 
a=0;//     iget v0, p0, Lcn/sharesdk/framework/statistics/b;->i:I
a=0;// 
a=0;//     add-int/lit16 v0, v0, 0x4e20
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p1, Lcn/sharesdk/framework/statistics/b/c;->j:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->d:Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->o()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p1, Lcn/sharesdk/framework/statistics/b/c;->k:I
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->d:Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/b;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p1, Lcn/sharesdk/framework/statistics/b/c;->l:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "cn.sharesdk.demo"
a=0;// 
a=0;//     iget-object v1, p1, Lcn/sharesdk/framework/statistics/b/c;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "api20"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/b;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isDebug()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     const-string v1, "Your application is using the appkey of ShareSDK Demo, this will cause its data won\'t be count!"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->d:Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/b;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p1, Lcn/sharesdk/framework/statistics/b/c;->m:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c()V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/statistics/b;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-boolean v1, p0, Lcn/sharesdk/framework/statistics/b;->l:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcn/sharesdk/framework/statistics/b;->l:Z
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcn/sharesdk/framework/statistics/b;->k:J
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/statistics/b/g;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/statistics/b/g;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/statistics/b/g;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/b/g;);
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/statistics/b;->a(Lcn/sharesdk/framework/statistics/b/c;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-boolean v1, p0, Lcn/sharesdk/framework/statistics/b;->l:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcn/sharesdk/framework/statistics/b;->l:Z
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p0, Lcn/sharesdk/framework/statistics/b;->k:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     new-instance v2, Lcn/sharesdk/framework/statistics/b/e;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/sharesdk/framework/statistics/b/e;);
a=0;//     invoke-direct {v2}, Lcn/sharesdk/framework/statistics/b/e;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/statistics/b/e;);
a=0;//     iput-wide v0, v2, Lcn/sharesdk/framework/statistics/b/e;->a:J
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcn/sharesdk/framework/statistics/b;->a(Lcn/sharesdk/framework/statistics/b/c;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private c(Lcn/sharesdk/framework/statistics/b/c;)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->e:Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a;);
a=0;//     invoke-virtual {v0, p1}, Lcn/sharesdk/framework/statistics/a;->a(Lcn/sharesdk/framework/statistics/b/c;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lcn/sharesdk/framework/statistics/b/c;->b(Landroid/content/Context;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/statistics/b/c;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private d()Z
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->w()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->r()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private e()V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/statistics/a;->a(Landroid/content/Context;)Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/statistics/a;->b()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lcn/sharesdk/framework/statistics/b;->i:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/os/Handler;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/statistics/b;->g:Landroid/os/Handler;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected a(Landroid/os/Message;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iget-boolean v0, p0, Lcn/sharesdk/framework/statistics/b;->j:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iput-boolean v2, p0, Lcn/sharesdk/framework/statistics/b;->j:Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->e:Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/a;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/b;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/statistics/a;->a(Ljava/lang/String;)J
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->e:Lcn/sharesdk/framework/statistics/a;
a=0;// 
a=0;//     iget-boolean v1, p0, Lcn/sharesdk/framework/statistics/b;->h:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/statistics/a;->a(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->a:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->a:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/statistics/NewAppReceiver;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "cn.sharesdk.START_UP"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "packageName"
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/statistics/b;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v2}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/utils/b;->r()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/b;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/sharesdk/framework/statistics/b/c;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-boolean v0, p0, Lcn/sharesdk/framework/statistics/b;->j:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcn/sharesdk/framework/statistics/b;->b(Lcn/sharesdk/framework/statistics/b/c;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {p1, v0}, Lcn/sharesdk/framework/statistics/b/c;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/b;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Drop event: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/framework/statistics/b/c;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/statistics/b;->f:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lcn/sharesdk/framework/statistics/b;->h:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected b(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-boolean v0, p0, Lcn/sharesdk/framework/statistics/b;->j:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p0, Lcn/sharesdk/framework/statistics/b;->k:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long/2addr v0, v2
a=0;// 
a=0;//     new-instance v2, Lcn/sharesdk/framework/statistics/b/e;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/sharesdk/framework/statistics/b/e;);
a=0;//     invoke-direct {v2}, Lcn/sharesdk/framework/statistics/b/e;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/statistics/b/e;);
a=0;//     iput-wide v0, v2, Lcn/sharesdk/framework/statistics/b/e;->a:J
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcn/sharesdk/framework/statistics/b;->a(Lcn/sharesdk/framework/statistics/b/c;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcn/sharesdk/framework/statistics/b;->j:Z
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->g:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcn/sharesdk/framework/statistics/b;->b:Lcn/sharesdk/framework/statistics/b;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Looper;->quit()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Landroid/os/Handler;);v2=(Reference,Lcn/sharesdk/framework/statistics/b/e;);v3=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected c(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lcn/sharesdk/framework/statistics/b/c;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcn/sharesdk/framework/statistics/b;->c(Lcn/sharesdk/framework/statistics/b/c;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/statistics/b;->c()V
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-wide/16 v2, 0x64
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/statistics/b;->e()V
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/b;->a:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-wide/16 v2, 0x2710
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
