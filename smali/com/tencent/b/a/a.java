package com.tencent.b.a; class a { void a() { int a;
a=0;// .class public Lcom/tencent/b/a/a;
a=0;// .super Lcom/tencent/b/a/f;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Handler$Callback;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcom/tencent/b/a/b;
a=0;// 
a=0;// .field private b:Ljava/io/FileWriter;
a=0;// 
a=0;// .field private c:Ljava/io/File;
a=0;// 
a=0;// .field private d:[C
a=0;// 
a=0;// .field private volatile e:Lcom/tencent/b/a/d;
a=0;// 
a=0;// .field private volatile f:Lcom/tencent/b/a/d;
a=0;// 
a=0;// .field private volatile g:Lcom/tencent/b/a/d;
a=0;// 
a=0;// .field private volatile h:Lcom/tencent/b/a/d;
a=0;// 
a=0;// .field private volatile i:Z
a=0;// 
a=0;// .field private j:Landroid/os/HandlerThread;
a=0;// 
a=0;// .field private k:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(IZLcom/tencent/b/a/e;Lcom/tencent/b/a/b;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/tencent/b/a/f;-><init>(IZLcom/tencent/b/a/e;)V
a=0;// 
a=0;//     .line 60
a=0;//     #p0=(Reference,Lcom/tencent/b/a/a;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/tencent/b/a/a;->i:Z
a=0;// 
a=0;//     .line 93
a=0;//     invoke-virtual {p0, p4}, Lcom/tencent/b/a/a;->a(Lcom/tencent/b/a/b;)V
a=0;// 
a=0;//     .line 95
a=0;//     new-instance v0, Lcom/tencent/b/a/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/b/a/d;);
a=0;//     invoke-direct {v0}, Lcom/tencent/b/a/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/d;);
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/a;->e:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     .line 96
a=0;//     new-instance v0, Lcom/tencent/b/a/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/b/a/d;);
a=0;//     invoke-direct {v0}, Lcom/tencent/b/a/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/d;);
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/a;->f:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->e:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/a;->g:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->f:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/a;->h:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {p4}, Lcom/tencent/b/a/b;->f()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [C
a=0;// 
a=0;//     #v0=(Reference,[C);
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/a;->d:[C
a=0;// 
a=0;//     .line 103
a=0;//     invoke-virtual {p4}, Lcom/tencent/b/a/b;->b()V
a=0;// 
a=0;//     .line 105
a=0;//     invoke-direct {p0}, Lcom/tencent/b/a/a;->h()Ljava/io/Writer;
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v0, Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {p4}, Lcom/tencent/b/a/b;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p4}, Lcom/tencent/b/a/b;->i()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/HandlerThread;);
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/a;->j:Landroid/os/HandlerThread;
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->j:Landroid/os/HandlerThread;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->j:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
a=0;// 
a=0;//     .line 114
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->j:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->isAlive()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->j:Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 116
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Lcom/tencent/b/a/a;->j:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/a;->k:Landroid/os/Handler;
a=0;// 
a=0;//     .line 119
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/tencent/b/a/a;->f()V
a=0;// 
a=0;//     .line 120
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/tencent/b/a/b;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     const/16 v0, 0x3f
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     sget-object v2, Lcom/tencent/b/a/e;->a:Lcom/tencent/b/a/e;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/b/a/e;);
a=0;//     invoke-direct {p0, v0, v1, v2, p1}, Lcom/tencent/b/a/a;-><init>(IZLcom/tencent/b/a/e;Lcom/tencent/b/a/b;)V
a=0;// 
a=0;//     .line 74
a=0;//     #p0=(Reference,Lcom/tencent/b/a/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private f()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->k:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v1, 0x400
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/a;->c()Lcom/tencent/b/a/b;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/b/a/b;);
a=0;//     invoke-virtual {v2}, Lcom/tencent/b/a/b;->g()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     .line 193
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private g()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     iget-object v1, p0, Lcom/tencent/b/a/a;->j:Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/HandlerThread;);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 232
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 206
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/Thread;);v2=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/tencent/b/a/a;->i:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/tencent/b/a/a;->i:Z
a=0;// 
a=0;//     .line 214
a=0;//     invoke-direct {p0}, Lcom/tencent/b/a/a;->j()V
a=0;// 
a=0;//     .line 218
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->h:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/d;);
a=0;//     invoke-direct {p0}, Lcom/tencent/b/a/a;->h()Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/b/a/a;->d:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/tencent/b/a/d;->a(Ljava/io/Writer;[C)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->h:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/b/a/d;->b()V
a=0;// 
a=0;//     .line 231
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/tencent/b/a/a;->i:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 220
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 227
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->h:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/b/a/d;->b()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcom/tencent/b/a/a;->h:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/b/a/d;->b()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private h()Ljava/io/Writer;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/a;->c()Lcom/tencent/b/a/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/b;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/b/a/b;->a()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 245
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/b/a/a;->c:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/File;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 247
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/a;->c:Ljava/io/File;
a=0;// 
a=0;//     .line 249
a=0;//     invoke-direct {p0}, Lcom/tencent/b/a/a;->i()V
a=0;// 
a=0;//     .line 253
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/FileWriter;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileWriter;);
a=0;//     iget-object v1, p0, Lcom/tencent/b/a/a;->c:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileWriter;);
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/a;->b:Ljava/io/FileWriter;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 261
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->b:Ljava/io/FileWriter;
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 255
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 257
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private i()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 275
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->b:Ljava/io/FileWriter;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileWriter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 277
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->b:Ljava/io/FileWriter;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/FileWriter;->flush()V
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->b:Ljava/io/FileWriter;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/FileWriter;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 285
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 281
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 283
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private j()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 292
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 294
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->g:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/d;);
a=0;//     iget-object v1, p0, Lcom/tencent/b/a/a;->e:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/b/a/d;);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 296
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->f:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/a;->g:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->e:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/a;->h:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     .line 304
a=0;//     :goto_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     .line 305
a=0;//     return-void
a=0;// 
a=0;//     .line 301
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->e:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/a;->g:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     .line 302
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->f:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/b/a/a;->h:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 304
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x400
a=0;// 
a=0;//     .line 128
a=0;//     #v1=(PosShort);
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->k:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     .line 132
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected a(ILjava/lang/Thread;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/a;->e()Lcom/tencent/b/a/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/e;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Thread;);
a=0;//     move-wide v3, p3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     move-object v5, p5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v6, p6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcom/tencent/b/a/e;->a(ILjava/lang/Thread;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 153
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/b/a/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 154
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcom/tencent/b/a/b;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 325
a=0;//     iput-object p1, p0, Lcom/tencent/b/a/a;->a:Lcom/tencent/b/a/b;
a=0;// 
a=0;//     .line 326
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected a(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->g:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/d;);
a=0;//     invoke-virtual {v0, p1}, Lcom/tencent/b/a/d;->a(Ljava/lang/String;)I
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->g:Lcom/tencent/b/a/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/tencent/b/a/d;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/a;->c()Lcom/tencent/b/a/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/b/a/b;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/b/a/b;->f()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {p0}, Lcom/tencent/b/a/a;->a()V
a=0;// 
a=0;//     .line 166
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     invoke-direct {p0}, Lcom/tencent/b/a/a;->i()V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->j:Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/HandlerThread;);
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z
a=0;// 
a=0;//     .line 146
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c()Lcom/tencent/b/a/b;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 314
a=0;//     iget-object v0, p0, Lcom/tencent/b/a/a;->a:Lcom/tencent/b/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/b/a/b;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public handleMessage(Landroid/os/Message;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 182
a=0;//     :goto_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// 
a=0;//     .line 175
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0}, Lcom/tencent/b/a/a;->g()V
a=0;// 
a=0;//     .line 176
a=0;//     invoke-direct {p0}, Lcom/tencent/b/a/a;->f()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 171
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x400
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
