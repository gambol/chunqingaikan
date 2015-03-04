package safiap.framework; class SafFrameworkManager$d { void a() { int a;
a=0;// .class final Lsafiap/framework/SafFrameworkManager$d;
a=0;// .super Lsafiap/framework/SafFrameworkManager$b;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lsafiap/framework/SafFrameworkManager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "d"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Z
a=0;// 
a=0;// .field private c:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;// .field private d:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lsafiap/framework/sdk/ISAFFrameworkCallback;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private e:J
a=0;// 
a=0;// .field private synthetic f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lsafiap/framework/SafFrameworkManager;Landroid/content/Context;Lsafiap/framework/a/b;Z)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 284
a=0;//     #v2=(One);
a=0;//     iput-object p1, p0, Lsafiap/framework/SafFrameworkManager$d;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     .line 285
a=0;//     invoke-direct {p0, p1, p2, p3, v2}, Lsafiap/framework/SafFrameworkManager$b;-><init>(Lsafiap/framework/SafFrameworkManager;Landroid/content/Context;Lsafiap/framework/a/b;Z)V
a=0;// 
a=0;//     .line 281
a=0;//     #p0=(Reference,Lsafiap/framework/SafFrameworkManager$d;);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lsafiap/framework/SafFrameworkManager$d;->e:J
a=0;// 
a=0;//     .line 286
a=0;//     iput-boolean v2, p0, Lsafiap/framework/SafFrameworkManager$d;->b:Z
a=0;// 
a=0;//     .line 287
a=0;//     invoke-static {p1}, Lsafiap/framework/SafFrameworkManager;->f(Lsafiap/framework/SafFrameworkManager;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c;);
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$d;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/a/c;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit16 v0, v0, 0x400
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lsafiap/framework/SafFrameworkManager$d;->e:J
a=0;// 
a=0;//     .line 288
a=0;//     invoke-static {p1}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$d;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 289
a=0;//     invoke-static {p1}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$d;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager$d;->c:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     .line 290
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$d;->c:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     iget-object v0, v0, Lsafiap/framework/SafFrameworkManager$c;->e:Ljava/util/List;
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager$d;->d:Ljava/util/List;
a=0;// 
a=0;//     .line 293
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected final varargs a([Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     .line 298
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$d;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lsafiap/framework/sdk/b/d;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 299
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$d;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-boolean v1, p0, Lsafiap/framework/SafFrameworkManager$d;->b:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v0, v6, v1}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 300
a=0;//     #v7=(Reference,Ljava/io/File;);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$d;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/sdk/b/d;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 301
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$d;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-boolean v1, p0, Lsafiap/framework/SafFrameworkManager$d;->b:Z
a=0;// 
a=0;//     invoke-static {v0, v5, v1}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 302
a=0;//     #v8=(Reference,Ljava/io/File;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     .line 303
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 305
a=0;//     #v4=(Null);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 308
a=0;//     :cond_0
a=0;//     #v0=(LongLo);v1=(LongHi);v4=(Integer);v9=(Conflicted);v10=(Conflicted);
a=0;//     iget-wide v9, p0, Lsafiap/framework/SafFrameworkManager$d;->e:J
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     cmp-long v9, v2, v9
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-gez v9, :cond_4
a=0;// 
a=0;//     .line 311
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 316
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v7}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 317
a=0;//     #v2=(LongLo);
a=0;//     cmp-long v9, v2, v0
a=0;// 
a=0;//     if-lez v9, :cond_2
a=0;// 
a=0;//     .line 319
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Integer;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     long-to-int v4, v2
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v4, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iget-wide v9, p0, Lsafiap/framework/SafFrameworkManager$d;->e:J
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     long-to-int v4, v9
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v4, v0, v1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lsafiap/framework/SafFrameworkManager$d;->publishProgress([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 320
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     .line 325
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(LongLo);v1=(LongHi);v4=(Integer);v9=(Conflicted);
a=0;//     const-wide/16 v9, 0x0
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     cmp-long v9, v2, v9
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-nez v9, :cond_3
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_3
a=0;// 
a=0;//     .line 326
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Integer;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v8}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     long-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v8}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     long-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lsafiap/framework/SafFrameworkManager$d;->publishProgress([Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object v0, v5
a=0;// 
a=0;//     .line 357
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v9=(Byte);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 312
a=0;//     :catch_0
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(LongLo);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 313
a=0;//     #v2=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v2}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 321
a=0;//     :cond_2
a=0;//     #v2=(LongLo);
a=0;//     cmp-long v9, v2, v0
a=0;// 
a=0;//     if-gtz v9, :cond_1
a=0;// 
a=0;//     .line 322
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 330
a=0;//     :cond_3
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-lt v4, v9, :cond_0
a=0;// 
a=0;//     .line 332
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$d;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "notification"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 333
a=0;//     sget v1, Lsafiap/framework/SafFrameworkManager;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 335
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$d;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$d;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lsafiap/framework/sdk/b/d;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {v0, v1, v4}, Lsafiap/framework/sdk/b/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     .line 336
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);v9=(Byte);
a=0;//     iget-wide v0, p0, Lsafiap/framework/SafFrameworkManager$d;->e:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, v2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_5
a=0;// 
a=0;//     .line 340
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 342
a=0;//     :cond_5
a=0;//     #v0=(Byte);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$d;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-boolean v1, p0, Lsafiap/framework/SafFrameworkManager$d;->b:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v0, v5, v1}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 345
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v0, v2, :cond_6
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     .line 347
a=0;//     const-wide/16 v1, 0x12c
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 351
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$d;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v1}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-boolean v2, p0, Lsafiap/framework/SafFrameworkManager$d;->b:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {v1, v5, v2}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 345
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 348
a=0;//     :catch_1
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 349
a=0;//     #v1=(Reference,Ljava/lang/InterruptedException;);
a=0;//     invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 354
a=0;//     :cond_6
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     move-object v0, v5
a=0;// 
a=0;//     .line 355
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);
a=0;//     move-object v0, v6
a=0;// 
a=0;//     .line 357
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected final a(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 375
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 376
a=0;//     invoke-static {p1}, Lsafiap/framework/sdk/b/d;->d(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 380
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$d;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$d;->d:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$d;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v0, v1, v2, v3}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;Ljava/util/List;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 385
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$d;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$d;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 386
a=0;//     return-void
a=0;// 
a=0;//     .line 382
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$d;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$d;->d:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$d;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0xb
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v0, v1, v2, v3}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;Ljava/util/List;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final varargs a([Ljava/lang/Integer;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 366
a=0;//     #v4=(One);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v4, :cond_0
a=0;// 
a=0;//     .line 367
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$d;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$d;->d:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$d;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object v3, p1, v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-object v4, p1, v4
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v0, v1, v2, v3, v4}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;Ljava/util/List;Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 370
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     check-cast p1, [Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lsafiap/framework/SafFrameworkManager$d;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected final synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lsafiap/framework/SafFrameworkManager$d;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final synthetic onProgressUpdate([Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     check-cast p1, [Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lsafiap/framework/SafFrameworkManager$d;->a([Ljava/lang/Integer;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
