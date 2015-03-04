package net.slidingmenu.tools.b.b.g.c; class a { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/g/c/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:J
a=0;// 
a=0;// .field private b:J
a=0;// 
a=0;// .field private c:Ljava/io/File;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/io/File;JJ)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/g/c/a;);
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->a:J
a=0;// 
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->b:J
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "directory must not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v1, "please set a file cache directory"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(LongHi);
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->c:Ljava/io/File;
a=0;// 
a=0;//     iput-wide p2, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->b:J
a=0;// 
a=0;//     iput-wide p4, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->a:J
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/b/g/c/a;->b()V
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/b/g/c/a;->c()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/b/b/g/c/a;)Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->c:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/io/File;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->a:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v3, -0x1
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->a:J
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->lastModified()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     sub-long/2addr v1, v3
a=0;// 
a=0;//     iget-wide v3, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->a:J
a=0;// 
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/b/b/g/c/a;Ljava/io/File;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/b/b/g/c/a;->a(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lnet/slidingmenu/tools/b/b/g/c/a;)J
a=0;//     .locals 2
a=0;// 
a=0;//     iget-wide v0, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->b:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->c:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->c:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->c:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private c()V
a=0;//     .locals 4
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v0, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->b:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     iget-wide v0, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->a:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Byte);v1=(LongHi);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/h/c;->a()Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/b/g/c/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/b/g/c/b;);
a=0;//     invoke-direct {v1, p0}, Lnet/slidingmenu/tools/b/b/g/c/b;-><init>(Lnet/slidingmenu/tools/b/b/g/c/a;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/b/g/c/b;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()[Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->c:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/g/c/a;->c:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public c(Ljava/lang/String;)Ljava/io/File;
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/b/b/g/c/a;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Conflicted);
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
}}
