package net.slidingmenu.tools.b.b.f; class a { void a() { int a;
a=0;// .class Lnet/slidingmenu/tools/b/b/f/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:J
a=0;// 
a=0;// .field protected b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>(Ljava/nio/channels/SelectableChannel;J)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/f/a;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-wide p2, p0, Lnet/slidingmenu/tools/b/b/f/a;->a:J
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Ljava/nio/channels/Selector;->open()Ljava/nio/channels/Selector;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/nio/channels/Selector;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p1, v1, v0}, Ljava/nio/channels/SelectableChannel;->register(Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/channels/SelectionKey;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/f/a;->b:Ljava/nio/channels/SelectionKey;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/nio/channels/Selector;->close()V
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Ljava/nio/channels/SelectableChannel;->close()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Ljava/nio/channels/SelectionKey;J)V
a=0;//     .locals 6
a=0;// 
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sub-long v1, p1, v0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     cmp-long v3, v1, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/nio/channels/SelectionKey;->selector()Ljava/nio/channels/Selector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/channels/Selector;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/nio/channels/Selector;->select(J)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/net/SocketTimeoutException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/SocketTimeoutException;);
a=0;//     invoke-direct {v0}, Ljava/net/SocketTimeoutException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(LongLo);
a=0;//     cmp-long v1, v1, v4
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/nio/channels/SelectionKey;->selector()Ljava/nio/channels/Selector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/channels/Selector;);
a=0;//     invoke-virtual {v0}, Ljava/nio/channels/Selector;->selectNow()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/a;->b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/channels/SelectionKey;);
a=0;//     invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->selector()Ljava/nio/channels/Selector;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/nio/channels/Selector;->close()V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/a;->b:Ljava/nio/channels/SelectionKey;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/nio/channels/SelectableChannel;->close()V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
