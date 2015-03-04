package com.tencent.a.b; class f$b { void a() { int a;
a=0;// .class final Lcom/tencent/a/b/f$b;
a=0;// .super Ljava/lang/Thread;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/a/b/f;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "b"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/String;
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private synthetic d:Lcom/tencent/a/b/f;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/a/b/f;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object p1, p0, Lcom/tencent/a/b/f$b;->d:Lcom/tencent/a/b/f;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/a/b/f$b;);
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/f$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/f$b;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/f$b;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/a/b/f$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Lcom/tencent/a/b/f;->h(Lcom/tencent/a/b/f;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "http://lstest.map.soso.com/loc?c=1"
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "&mars="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/a/b/f;->i(Lcom/tencent/a/b/f;)I
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
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/f$b;->b:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v0, "http://lbs.map.qq.com/loc?c=1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a([BLjava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/f$b;->d:Lcom/tencent/a/b/f;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/f;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/a/b/f;->a(Lcom/tencent/a/b/f;J)J
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v1, p1, p2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
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
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Landroid/os/Message;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v2}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Message;);
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v2, Landroid/os/Message;->what:I
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/f$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/j;->a([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/a/b/f$b;->d:Lcom/tencent/a/b/f;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/a/b/f;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {v3, v4}, Lcom/tencent/a/b/f;->a(Lcom/tencent/a/b/f;Z)Z
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/a/b/f$b;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "SOSO MAP LBS SDK"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v0}, Lcom/tencent/a/b/b;->a(Ljava/lang/String;Ljava/lang/String;[B)Lcom/tencent/a/b/n;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/a/b/f$b;->d:Lcom/tencent/a/b/f;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v4}, Lcom/tencent/a/b/f;->a(Lcom/tencent/a/b/f;Z)Z
a=0;// 
a=0;//     iget-object v3, v0, Lcom/tencent/a/b/n;->a:[B
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/a/b/j;->b([B)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v0, v0, Lcom/tencent/a/b/n;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v3, v0}, Lcom/tencent/a/b/f$b;->a([BLjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/f$b;->c:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/f$b;->c:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, v2, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/f$b;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/f$b;->d:Lcom/tencent/a/b/f;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/f;);
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/f;->j(Lcom/tencent/a/b/f;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/f$b;->d:Lcom/tencent/a/b/f;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/f;->d(Lcom/tencent/a/b/f;)Lcom/tencent/a/b/f$c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/tencent/a/b/f$c;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Reference,[B);v4=(Null);v5=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(One);
a=0;//     iput v0, v2, Landroid/os/Message;->arg1:I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v5=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-gt v0, v3, :cond_2
a=0;// 
a=0;//     const-wide/16 v3, 0x3e8
a=0;// 
a=0;//     :try_start_2
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Lcom/tencent/a/b/f$b;->sleep(J)V
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/a/b/f$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/a/b/j;->a([B)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/tencent/a/b/f$b;->d:Lcom/tencent/a/b/f;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/a/b/f;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-static {v4, v5}, Lcom/tencent/a/b/f;->a(Lcom/tencent/a/b/f;Z)Z
a=0;// 
a=0;//     iget-object v4, p0, Lcom/tencent/a/b/f$b;->b:Ljava/lang/String;
a=0;// 
a=0;//     const-string v5, "SOSO MAP LBS SDK"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5, v3}, Lcom/tencent/a/b/b;->a(Ljava/lang/String;Ljava/lang/String;[B)Lcom/tencent/a/b/n;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/tencent/a/b/f$b;->d:Lcom/tencent/a/b/f;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v4, v5}, Lcom/tencent/a/b/f;->a(Lcom/tencent/a/b/f;Z)Z
a=0;// 
a=0;//     iget-object v4, v3, Lcom/tencent/a/b/n;->a:[B
a=0;// 
a=0;//     invoke-static {v4}, Lcom/tencent/a/b/j;->b([B)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v3, v3, Lcom/tencent/a/b/n;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v4, v3}, Lcom/tencent/a/b/f$b;->a([BLjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Lcom/tencent/a/b/f$b;->c:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/a/b/f$b;->c:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput v3, v2, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/a/b/f$b;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iput-object v3, v2, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Reference,[B);v5=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iput v3, v2, Landroid/os/Message;->arg1:I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(PosByte);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/f$b;->d:Lcom/tencent/a/b/f;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/f;);
a=0;//     invoke-static {v0, v1}, Lcom/tencent/a/b/f;->a(Lcom/tencent/a/b/f;Z)Z
a=0;// 
a=0;//     iput v6, v2, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
