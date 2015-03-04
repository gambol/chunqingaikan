package com.android.volley; class VolleyLog$MarkerLog { void a() { int a;
a=0;// .class Lcom/android/volley/VolleyLog$MarkerLog;
a=0;// .super Ljava/lang/Object;
a=0;// .source "VolleyLog.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/android/volley/VolleyLog;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "MarkerLog"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/android/volley/VolleyLog$MarkerLog$Marker;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final ENABLED:Z
a=0;// 
a=0;// .field private static final MIN_DURATION_FOR_LOGGING_MS:J
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mFinished:Z
a=0;// 
a=0;// .field private final mMarkers:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/android/volley/VolleyLog$MarkerLog$Marker;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     sget-boolean v0, Lcom/android/volley/VolleyLog;->DEBUG:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lcom/android/volley/VolleyLog$MarkerLog;->ENABLED:Z
a=0;// 
a=0;//     .line 107
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 121
a=0;//     #p0=(Reference,Lcom/android/volley/VolleyLog$MarkerLog;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/android/volley/VolleyLog$MarkerLog;->mMarkers:Ljava/util/List;
a=0;// 
a=0;//     .line 122
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/android/volley/VolleyLog$MarkerLog;->mFinished:Z
a=0;// 
a=0;//     .line 103
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getTotalDuration()J
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     iget-object v4, p0, Lcom/android/volley/VolleyLog$MarkerLog;->mMarkers:Ljava/util/List;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 168
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     .line 173
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(LongLo);v5=(LongHi);
a=0;//     return-wide v4
a=0;// 
a=0;//     .line 171
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Integer);v5=(Uninit);
a=0;//     iget-object v4, p0, Lcom/android/volley/VolleyLog$MarkerLog;->mMarkers:Ljava/util/List;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/android/volley/VolleyLog$MarkerLog$Marker;
a=0;// 
a=0;//     iget-wide v0, v4, Lcom/android/volley/VolleyLog$MarkerLog$Marker;->time:J
a=0;// 
a=0;//     .line 172
a=0;//     .local v0, "first":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-object v4, p0, Lcom/android/volley/VolleyLog$MarkerLog;->mMarkers:Ljava/util/List;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/android/volley/VolleyLog$MarkerLog;->mMarkers:Ljava/util/List;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Lcom/android/volley/VolleyLog$MarkerLog$Marker;
a=0;// 
a=0;//     iget-wide v2, v4, Lcom/android/volley/VolleyLog$MarkerLog$Marker;->time:J
a=0;// 
a=0;//     .line 173
a=0;//     .local v2, "last":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sub-long v4, v2, v0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public declared-synchronized add(Ljava/lang/String;J)V
a=0;//     .locals 7
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "threadId"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lcom/android/volley/VolleyLog$MarkerLog;->mFinished:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Marker added to finished log"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 126
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 130
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v6, p0, Lcom/android/volley/VolleyLog$MarkerLog;->mMarkers:Ljava/util/List;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/List;);
a=0;//     new-instance v0, Lcom/android/volley/VolleyLog$MarkerLog$Marker;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/VolleyLog$MarkerLog$Marker;);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-wide v2, p2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/android/volley/VolleyLog$MarkerLog$Marker;-><init>(Ljava/lang/String;JJ)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/VolleyLog$MarkerLog$Marker;);
a=0;//     invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 131
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected finalize()V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     iget-boolean v0, p0, Lcom/android/volley/VolleyLog$MarkerLog;->mFinished:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     const-string v0, "Request on the loose"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/android/volley/VolleyLog$MarkerLog;->finish(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 161
a=0;//     const-string v0, "Marker log finalized without finish() - uncaught exit point for request"
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcom/android/volley/VolleyLog;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized finish(Ljava/lang/String;)V
a=0;//     .locals 13
a=0;//     .param p1, "header"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v7=(One);
a=0;//     iput-boolean v7, p0, Lcom/android/volley/VolleyLog$MarkerLog;->mFinished:Z
a=0;// 
a=0;//     .line 141
a=0;//     invoke-direct {p0}, Lcom/android/volley/VolleyLog$MarkerLog;->getTotalDuration()J
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 142
a=0;//     .local v0, "duration":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v7, 0x0
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     cmp-long v7, v0, v7
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-gtz v7, :cond_1
a=0;// 
a=0;//     .line 153
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 146
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Byte);v8=(LongHi);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     iget-object v7, p0, Lcom/android/volley/VolleyLog$MarkerLog;->mMarkers:Ljava/util/List;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/List;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     check-cast v7, Lcom/android/volley/VolleyLog$MarkerLog$Marker;
a=0;// 
a=0;//     iget-wide v3, v7, Lcom/android/volley/VolleyLog$MarkerLog$Marker;->time:J
a=0;// 
a=0;//     .line 147
a=0;//     .local v3, "prevTime":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-string v7, "(%-4d ms) %s"
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     new-array v8, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v8=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v10, v8, v9
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     aput-object p1, v8, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Lcom/android/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v7, p0, Lcom/android/volley/VolleyLog$MarkerLog;->mMarkers:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/android/volley/VolleyLog$MarkerLog$Marker;
a=0;// 
a=0;//     .line 149
a=0;//     .local v2, "marker":Lcom/android/volley/VolleyLog$MarkerLog$Marker;
a=0;//     iget-wide v5, v2, Lcom/android/volley/VolleyLog$MarkerLog$Marker;->time:J
a=0;// 
a=0;//     .line 150
a=0;//     .local v5, "thisTime":J
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const-string v8, "(+%-4d) [%2d] %s"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     new-array v9, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     #v9=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     sub-long v11, v5, v3
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     iget-wide v11, v2, Lcom/android/volley/VolleyLog$MarkerLog$Marker;->thread:J
a=0;// 
a=0;//     #v11=(LongLo);
a=0;//     invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     iget-object v11, v2, Lcom/android/volley/VolleyLog$MarkerLog$Marker;->name:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v11, v9, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Lcom/android/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 151
a=0;//     move-wide v3, v5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 139
a=0;//     .end local v0    # "duration":J
a=0;//     .end local v2    # "marker":Lcom/android/volley/VolleyLog$MarkerLog$Marker;
a=0;//     .end local v3    # "prevTime":J
a=0;//     .end local v5    # "thisTime":J
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v7
a=0;// .end method
}}
