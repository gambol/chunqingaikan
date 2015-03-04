package com.android.volley; class Request { void a() { int a;
a=0;// .class public abstract Lcom/android/volley/Request;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Request.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Comparable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/android/volley/Request$Method;,
a=0;//         Lcom/android/volley/Request$Priority;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/lang/Comparable",
a=0;//         "<",
a=0;//         "Lcom/android/volley/Request",
a=0;//         "<TT;>;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_PARAMS_ENCODING:Ljava/lang/String; = "UTF-8"
a=0;// 
a=0;// .field private static final SLOW_REQUEST_THRESHOLD_MS:J = 0xbb8L
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCacheEntry:Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;// .field private mCanceled:Z
a=0;// 
a=0;// .field private final mDefaultTrafficStatsTag:I
a=0;// 
a=0;// .field private final mErrorListener:Lcom/android/volley/Response$ErrorListener;
a=0;// 
a=0;// .field private final mEventLog:Lcom/android/volley/VolleyLog$MarkerLog;
a=0;// 
a=0;// .field private final mMethod:I
a=0;// 
a=0;// .field private mRequestBirthTime:J
a=0;// 
a=0;// .field private mRequestQueue:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;// .field private mResponseDelivered:Z
a=0;// 
a=0;// .field private mRetryPolicy:Lcom/android/volley/RetryPolicy;
a=0;// 
a=0;// .field private mSequence:Ljava/lang/Integer;
a=0;// 
a=0;// .field private mShouldCache:Z
a=0;// 
a=0;// .field private mTag:Ljava/lang/Object;
a=0;// 
a=0;// .field private final mUrl:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(ILjava/lang/String;Lcom/android/volley/Response$ErrorListener;)V
a=0;//     .locals 5
a=0;//     .param p1, "method"    # I
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     .local p3, "listener":Lcom/android/volley/Response$ErrorListener;, "Lcom/android/volley/Response$ErrorListener;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 123
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 57
a=0;//     #p0=(Reference,Lcom/android/volley/Request;);
a=0;//     sget-boolean v0, Lcom/android/volley/VolleyLog$MarkerLog;->ENABLED:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcom/android/volley/VolleyLog$MarkerLog;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/VolleyLog$MarkerLog;);
a=0;//     invoke-direct {v0}, Lcom/android/volley/VolleyLog$MarkerLog;-><init>()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/android/volley/VolleyLog$MarkerLog;);
a=0;//     iput-object v0, p0, Lcom/android/volley/Request;->mEventLog:Lcom/android/volley/VolleyLog$MarkerLog;
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/android/volley/Request;->mShouldCache:Z
a=0;// 
a=0;//     .line 81
a=0;//     iput-boolean v2, p0, Lcom/android/volley/Request;->mCanceled:Z
a=0;// 
a=0;//     .line 84
a=0;//     iput-boolean v2, p0, Lcom/android/volley/Request;->mResponseDelivered:Z
a=0;// 
a=0;//     .line 87
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     iput-wide v3, p0, Lcom/android/volley/Request;->mRequestBirthTime:J
a=0;// 
a=0;//     .line 100
a=0;//     iput-object v1, p0, Lcom/android/volley/Request;->mCacheEntry:Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     .line 124
a=0;//     iput p1, p0, Lcom/android/volley/Request;->mMethod:I
a=0;// 
a=0;//     .line 125
a=0;//     iput-object p2, p0, Lcom/android/volley/Request;->mUrl:Ljava/lang/String;
a=0;// 
a=0;//     .line 126
a=0;//     iput-object p3, p0, Lcom/android/volley/Request;->mErrorListener:Lcom/android/volley/Response$ErrorListener;
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v0, Lcom/android/volley/DefaultRetryPolicy;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/DefaultRetryPolicy;);
a=0;//     invoke-direct {v0}, Lcom/android/volley/DefaultRetryPolicy;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/DefaultRetryPolicy;);
a=0;//     invoke-virtual {p0, v0}, Lcom/android/volley/Request;->setRetryPolicy(Lcom/android/volley/RetryPolicy;)V
a=0;// 
a=0;//     .line 129
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/android/volley/Request;->mDefaultTrafficStatsTag:I
a=0;// 
a=0;//     .line 130
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 57
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 129
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Lcom/android/volley/Response$ErrorListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     .local p2, "listener":Lcom/android/volley/Response$ErrorListener;, "Lcom/android/volley/Response$ErrorListener;"
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0, v0, p1, p2}, Lcom/android/volley/Request;-><init>(ILjava/lang/String;Lcom/android/volley/Response$ErrorListener;)V
a=0;// 
a=0;//     .line 115
a=0;//     #p0=(Reference,Lcom/android/volley/Request;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/android/volley/Request;)Lcom/android/volley/VolleyLog$MarkerLog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/android/volley/Request;->mEventLog:Lcom/android/volley/VolleyLog$MarkerLog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/VolleyLog$MarkerLog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private encodeParameters(Ljava/util/Map;Ljava/lang/String;)[B
a=0;//     .locals 6
a=0;//     .param p2, "paramsEncoding"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")[B"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 401
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 403
a=0;//     .local v0, "encodedParams":Ljava/lang/StringBuilder;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 409
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     return-object v3
a=0;// 
a=0;//     .line 403
a=0;//     :cond_0
a=0;//     #v3=(Boolean);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 404
a=0;//     .local v1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v3, p2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 405
a=0;//     const/16 v3, 0x3d
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 406
a=0;//     invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v3, p2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 407
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 410
a=0;//     .end local v1    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 411
a=0;//     .local v2, "uee":Ljava/io/UnsupportedEncodingException;
a=0;//     #v2=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     new-instance v3, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Encoding not supported: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addMarker(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "tag"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     sget-boolean v0, Lcom/android/volley/VolleyLog$MarkerLog;->ENABLED:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/android/volley/Request;->mEventLog:Lcom/android/volley/VolleyLog$MarkerLog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/VolleyLog$MarkerLog;);
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, p1, v1, v2}, Lcom/android/volley/VolleyLog$MarkerLog;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 175
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-wide v0, p0, Lcom/android/volley/Request;->mRequestBirthTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 176
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iput-wide v0, p0, Lcom/android/volley/Request;->mRequestBirthTime:J
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public cancel()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 273
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/android/volley/Request;->mCanceled:Z
a=0;// 
a=0;//     .line 274
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public compareTo(Lcom/android/volley/Request;)I
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<TT;>;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 527
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     .local p1, "other":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getPriority()Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 528
a=0;//     .local v0, "left":Lcom/android/volley/Request$Priority;, "Lcom/android/volley/Request$Priority;"
a=0;//     #v0=(Reference,Lcom/android/volley/Request$Priority;);
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->getPriority()Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 532
a=0;//     .local v1, "right":Lcom/android/volley/Request$Priority;, "Lcom/android/volley/Request$Priority;"
a=0;//     #v1=(Reference,Lcom/android/volley/Request$Priority;);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 533
a=0;//     iget-object v2, p0, Lcom/android/volley/Request;->mSequence:Ljava/lang/Integer;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p1, Lcom/android/volley/Request;->mSequence:Ljava/lang/Integer;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     .line 532
a=0;//     :goto_0
a=0;//     return v2
a=0;// 
a=0;//     .line 534
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {v1}, Lcom/android/volley/Request$Priority;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0}, Lcom/android/volley/Request$Priority;->ordinal()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic compareTo(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Lcom/android/volley/Request;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/android/volley/Request;->compareTo(Lcom/android/volley/Request;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public deliverError(Lcom/android/volley/VolleyError;)V
a=0;//     .locals 1
a=0;//     .param p1, "error"    # Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     .prologue
a=0;//     .line 516
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iget-object v0, p0, Lcom/android/volley/Request;->mErrorListener:Lcom/android/volley/Response$ErrorListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Response$ErrorListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 517
a=0;//     iget-object v0, p0, Lcom/android/volley/Request;->mErrorListener:Lcom/android/volley/Response$ErrorListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcom/android/volley/Response$ErrorListener;->onErrorResponse(Lcom/android/volley/VolleyError;)V
a=0;// 
a=0;//     .line 519
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract deliverResponse(Ljava/lang/Object;)V
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method finish(Ljava/lang/String;)V
a=0;//     .locals 9
a=0;//     .param p1, "tag"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iget-object v5, p0, Lcom/android/volley/Request;->mRequestQueue:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     #v5=(Reference,Lcom/android/volley/RequestQueue;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v5, p0, Lcom/android/volley/Request;->mRequestQueue:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     invoke-virtual {v5, p0}, Lcom/android/volley/RequestQueue;->finish(Lcom/android/volley/Request;)V
a=0;// 
a=0;//     .line 189
a=0;//     :cond_0
a=0;//     sget-boolean v5, Lcom/android/volley/VolleyLog$MarkerLog;->ENABLED:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 190
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v5}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 191
a=0;//     .local v3, "threadId":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/os/Looper;);
a=0;//     if-eq v5, v6, :cond_2
a=0;// 
a=0;//     .line 194
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v0, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 195
a=0;//     .local v0, "mainThread":Landroid/os/Handler;
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v5, Lcom/android/volley/Request$1;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/android/volley/Request$1;);
a=0;//     invoke-direct {v5, p0, p1, v3, v4}, Lcom/android/volley/Request$1;-><init>(Lcom/android/volley/Request;Ljava/lang/String;J)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/android/volley/Request$1;);
a=0;//     invoke-virtual {v0, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 213
a=0;//     .end local v0    # "mainThread":Landroid/os/Handler;
a=0;//     .end local v3    # "threadId":J
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 205
a=0;//     .restart local v3    # "threadId":J
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(LongLo);v4=(LongHi);v5=(Reference,Landroid/os/Looper;);v6=(Reference,Landroid/os/Looper;);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v5, p0, Lcom/android/volley/Request;->mEventLog:Lcom/android/volley/VolleyLog$MarkerLog;
a=0;// 
a=0;//     invoke-virtual {v5, p1, v3, v4}, Lcom/android/volley/VolleyLog$MarkerLog;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v5, p0, Lcom/android/volley/Request;->mEventLog:Lcom/android/volley/VolleyLog$MarkerLog;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/android/volley/VolleyLog$MarkerLog;->finish(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 208
a=0;//     .end local v3    # "threadId":J
a=0;//     :cond_3
a=0;//     #v3=(Uninit);v4=(Uninit);v5=(Boolean);v6=(Uninit);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     iget-wide v7, p0, Lcom/android/volley/Request;->mRequestBirthTime:J
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     sub-long v1, v5, v7
a=0;// 
a=0;//     .line 209
a=0;//     .local v1, "requestTime":J
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v5, 0xbb8
a=0;// 
a=0;//     cmp-long v5, v1, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ltz v5, :cond_1
a=0;// 
a=0;//     .line 210
a=0;//     const-string v5, "%d ms: %s"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v6, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Long;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     invoke-static {v5, v6}, Lcom/android/volley/VolleyLog;->d(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getBody()[B
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/android/volley/AuthFailureError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 390
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getParams()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 391
a=0;//     .local v0, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 392
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getParamsEncoding()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/android/volley/Request;->encodeParameters(Ljava/util/Map;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 394
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getBodyContentType()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 381
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "application/x-www-form-urlencoded; charset="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getParamsEncoding()Ljava/lang/String;
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
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getCacheEntry()Lcom/android/volley/Cache$Entry;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iget-object v0, p0, Lcom/android/volley/Request;->mCacheEntry:Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Cache$Entry;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getCacheKey()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 251
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getHeaders()Ljava/util/Map;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/android/volley/AuthFailureError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMethod()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iget v0, p0, Lcom/android/volley/Request;->mMethod:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected getParams()Ljava/util/Map;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/android/volley/AuthFailureError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 361
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getParamsEncoding()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 377
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPostBody()[B
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/android/volley/AuthFailureError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 345
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getPostParams()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 346
a=0;//     .local v0, "postParams":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 347
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getPostParamsEncoding()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/android/volley/Request;->encodeParameters(Ljava/util/Map;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 349
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPostBodyContentType()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 330
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getBodyContentType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getPostParams()Ljava/util/Map;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/android/volley/AuthFailureError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 305
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getParams()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getPostParamsEncoding()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 323
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getParamsEncoding()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPriority()Lcom/android/volley/Request$Priority;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 444
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     sget-object v0, Lcom/android/volley/Request$Priority;->NORMAL:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request$Priority;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getRetryPolicy()Lcom/android/volley/RetryPolicy;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 460
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iget-object v0, p0, Lcom/android/volley/Request;->mRetryPolicy:Lcom/android/volley/RetryPolicy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/RetryPolicy;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getSequence()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iget-object v0, p0, Lcom/android/volley/Request;->mSequence:Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "getSequence called before setSequence"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 237
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/android/volley/Request;->mSequence:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTag()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iget-object v0, p0, Lcom/android/volley/Request;->mTag:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getTimeoutMs()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 453
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iget-object v0, p0, Lcom/android/volley/Request;->mRetryPolicy:Lcom/android/volley/RetryPolicy;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/RetryPolicy;);
a=0;//     invoke-interface {v0}, Lcom/android/volley/RetryPolicy;->getCurrentTimeout()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTrafficStatsTag()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iget v0, p0, Lcom/android/volley/Request;->mDefaultTrafficStatsTag:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getUrl()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iget-object v0, p0, Lcom/android/volley/Request;->mUrl:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasHadResponseDelivered()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 475
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iget-boolean v0, p0, Lcom/android/volley/Request;->mResponseDelivered:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCanceled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iget-boolean v0, p0, Lcom/android/volley/Request;->mCanceled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public markDelivered()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 468
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/android/volley/Request;->mResponseDelivered:Z
a=0;// 
a=0;//     .line 469
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected parseNetworkError(Lcom/android/volley/VolleyError;)Lcom/android/volley/VolleyError;
a=0;//     .locals 0
a=0;//     .param p1, "volleyError"    # Lcom/android/volley/VolleyError;
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method protected abstract parseNetworkResponse(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/NetworkResponse;",
a=0;//             ")",
a=0;//             "Lcom/android/volley/Response",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public setCacheEntry(Lcom/android/volley/Cache$Entry;)V
a=0;//     .locals 0
a=0;//     .param p1, "entry"    # Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     .prologue
a=0;//     .line 259
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iput-object p1, p0, Lcom/android/volley/Request;->mCacheEntry:Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     .line 260
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRequestQueue(Lcom/android/volley/RequestQueue;)V
a=0;//     .locals 0
a=0;//     .param p1, "requestQueue"    # Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iput-object p1, p0, Lcom/android/volley/Request;->mRequestQueue:Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     .line 221
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRetryPolicy(Lcom/android/volley/RetryPolicy;)V
a=0;//     .locals 0
a=0;//     .param p1, "retryPolicy"    # Lcom/android/volley/RetryPolicy;
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iput-object p1, p0, Lcom/android/volley/Request;->mRetryPolicy:Lcom/android/volley/RetryPolicy;
a=0;// 
a=0;//     .line 167
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setSequence(I)V
a=0;//     .locals 1
a=0;//     .param p1, "sequence"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     iput-object v0, p0, Lcom/android/volley/Request;->mSequence:Ljava/lang/Integer;
a=0;// 
a=0;//     .line 228
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final setShouldCache(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "shouldCache"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 419
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iput-boolean p1, p0, Lcom/android/volley/Request;->mShouldCache:Z
a=0;// 
a=0;//     .line 420
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTag(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p1, "tag"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iput-object p1, p0, Lcom/android/volley/Request;->mTag:Ljava/lang/Object;
a=0;// 
a=0;//     .line 145
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final shouldCache()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 426
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     iget-boolean v0, p0, Lcom/android/volley/Request;->mShouldCache:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 539
a=0;//     .local p0, "this":Lcom/android/volley/Request;, "Lcom/android/volley/Request<TT;>;"
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "0x"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getTrafficStatsTag()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 540
a=0;//     .local v0, "trafficStatsTag":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-boolean v1, p0, Lcom/android/volley/Request;->mCanceled:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v1, "[X] "
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 541
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getPriority()Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/android/volley/Request;->mSequence:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 540
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "[ ] "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
}}
