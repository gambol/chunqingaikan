package com.tencent.stat.common; class f { void a() { int a;
a=0;// .class public Lcom/tencent/stat/common/f;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static a:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcom/tencent/stat/common/f;->a:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;Ljava/lang/String;)J
a=0;//     .locals 2
a=0;// 
a=0;//     sget-wide v0, Lcom/tencent/stat/common/f;->a:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {p0, p1, v0, v1}, Lcom/tencent/stat/common/p;->a(Landroid/content/Context;Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;Ljava/lang/String;J)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-static {p0, p1, p2, p3}, Lcom/tencent/stat/common/p;->b(Landroid/content/Context;Ljava/lang/String;J)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Z
a=0;//     .locals 8
a=0;// 
a=0;//     const-class v1, Lcom/tencent/stat/common/f;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "1.6.2_begin_protection"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/common/f;->a(Landroid/content/Context;Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-string v0, "1.6.2_end__protection"
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/common/f;->a(Landroid/content/Context;Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v0, v2, v6
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     sget-wide v6, Lcom/tencent/stat/common/f;->a:J
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     cmp-long v0, v4, v6
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Byte);
a=0;//     sget-wide v4, Lcom/tencent/stat/common/f;->a:J
a=0;// 
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-string v0, "1.6.2_begin_protection"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     invoke-static {p0, v0, v2, v3}, Lcom/tencent/stat/common/f;->a(Landroid/content/Context;Ljava/lang/String;J)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized b(Landroid/content/Context;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const-class v1, Lcom/tencent/stat/common/f;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "1.6.2_end__protection"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/common/f;->a(Landroid/content/Context;Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sget-wide v4, Lcom/tencent/stat/common/f;->a:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "1.6.2_end__protection"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     invoke-static {p0, v0, v2, v3}, Lcom/tencent/stat/common/f;->a(Landroid/content/Context;Ljava/lang/String;J)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
