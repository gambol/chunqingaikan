package com.lidroid.xutils.util.core; class CompatibleAsyncTask { void a() { int a;
a=0;// .class public abstract Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CompatibleAsyncTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;,
a=0;//         Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;,
a=0;//         Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;,
a=0;//         Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;,
a=0;//         Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$WorkerRunnable;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<Params:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Progress:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Result:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static synthetic $SWITCH_TABLE$com$lidroid$xutils$util$core$CompatibleAsyncTask$Status:[I = null
a=0;// 
a=0;// .field private static final CORE_POOL_SIZE:I = 0x5
a=0;// 
a=0;// .field private static final KEEP_ALIVE:I = 0x1
a=0;// 
a=0;// .field private static final MAXIMUM_POOL_SIZE:I = 0x80
a=0;// 
a=0;// .field private static final MESSAGE_POST_PROGRESS:I = 0x2
a=0;// 
a=0;// .field private static final MESSAGE_POST_RESULT:I = 0x1
a=0;// 
a=0;// .field public static final SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;// .field public static final THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;// .field private static volatile sDefaultExecutor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;// .field private static final sHandler:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;
a=0;// 
a=0;// .field private static final sPoolWorkQueue:Ljava/util/concurrent/BlockingQueue;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/concurrent/BlockingQueue",
a=0;//             "<",
a=0;//             "Ljava/lang/Runnable;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static final sThreadFactory:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;// .field private final mFuture:Ljava/util/concurrent/FutureTask;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/concurrent/FutureTask",
a=0;//             "<TResult;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private volatile mStatus:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;// .field private final mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;// .field private final mWorker:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$WorkerRunnable;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$WorkerRunnable",
a=0;//             "<TParams;TResult;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static synthetic $SWITCH_TABLE$com$lidroid$xutils$util$core$CompatibleAsyncTask$Status()[I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->$SWITCH_TABLE$com$lidroid$xutils$util$core$CompatibleAsyncTask$Status:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;->values()[Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,[I);
a=0;//     sget-object v1, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;->FINISHED:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;);
a=0;//     invoke-virtual {v1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_2
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;->PENDING:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;);
a=0;//     invoke-virtual {v1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;->RUNNING:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;);
a=0;//     invoke-virtual {v1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sput-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->$SWITCH_TABLE$com$lidroid$xutils$util$core$CompatibleAsyncTask$Status:[I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 174
a=0;//     #v8=(Null);
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$1;);
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$1;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;//     .line 183
a=0;//     new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V
a=0;// 
a=0;//     .line 182
a=0;//     #v0=(Reference,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->sPoolWorkQueue:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     .line 189
a=0;//     new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ThreadPoolExecutor;);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     const/16 v2, 0x80
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const-wide/16 v3, 0x1
a=0;// 
a=0;//     .line 190
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/concurrent/TimeUnit;);
a=0;//     sget-object v6, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->sPoolWorkQueue:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     sget-object v7, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;//     .line 189
a=0;//     #v7=(Reference,Ljava/util/concurrent/ThreadFactory;);
a=0;//     invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
a=0;// 
a=0;//     .line 188
a=0;//     #v0=(Reference,Ljava/util/concurrent/ThreadPoolExecutor;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     .line 196
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;);
a=0;//     invoke-direct {v0, v8}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;-><init>(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$SerialExecutor;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     .line 201
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;);
a=0;//     invoke-direct {v0, v8}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;-><init>(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->sHandler:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;
a=0;// 
a=0;//     .line 203
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     sput-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     .line 169
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 207
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;);
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;->PENDING:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mStatus:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;//     .line 209
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 210
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 275
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$2;-><init>(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$2;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mWorker:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$WorkerRunnable;
a=0;// 
a=0;//     .line 285
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$3;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mWorker:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$WorkerRunnable;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$WorkerRunnable;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$3;-><init>(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;Ljava/util/concurrent/Callable;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$3;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;//     .line 300
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 608
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->finish(Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;)Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->postResult(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 302
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->postResultIfNotInvoked(Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static execute(Ljava/lang/Runnable;)V
a=0;//     .locals 1
a=0;//     .param p0, "runnable"    # Ljava/lang/Runnable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 585
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 586
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private finish(Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TResult;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 609
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     .local p1, "result":Ljava/lang/Object;, "TResult;"
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->isCancelled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 610
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->onCancelled(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 614
a=0;//     :goto_0
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;->FINISHED:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mStatus:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;//     .line 615
a=0;//     return-void
a=0;// 
a=0;//     .line 612
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->onPostExecute(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static init()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->sHandler:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;);
a=0;//     invoke-virtual {v0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     .line 262
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private postResult(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TResult;)TResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     .local p1, "result":Ljava/lang/Object;, "TResult;"
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 311
a=0;//     #v5=(One);
a=0;//     sget-object v1, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->sHandler:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;
a=0;// 
a=0;//     .line 312
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;);
a=0;//     new-instance v2, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;);
a=0;//     new-array v3, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object p1, v3, v4
a=0;// 
a=0;//     invoke-direct {v2, p0, v3}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;-><init>(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 311
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;);
a=0;//     invoke-virtual {v1, v5, v2}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 313
a=0;//     .local v0, "message":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 314
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private postResultIfNotInvoked(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TResult;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     .local p1, "result":Ljava/lang/Object;, "TResult;"
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 304
a=0;//     .local v0, "wasTaskInvoked":Z
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 305
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->postResult(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 307
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setDefaultExecutor(Ljava/util/concurrent/Executor;)V
a=0;//     .locals 0
a=0;//     .param p0, "exec"    # Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     sput-object p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     .line 269
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final cancel(Z)Z
a=0;//     .locals 2
a=0;//     .param p1, "mayInterruptIfRunning"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 452
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
a=0;// 
a=0;//     .line 453
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected varargs abstract doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([TParams;)TResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public final varargs execute([Ljava/lang/Object;)Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;//     .locals 1
a=0;//     .param p1, "params"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([TParams;)",
a=0;//             "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask",
a=0;//             "<TParams;TProgress;TResult;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 517
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final varargs executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;
a=0;//     .locals 2
a=0;//     .param p1, "exec"    # Ljava/util/concurrent/Executor;
a=0;//     .param p2, "params"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/concurrent/Executor;",
a=0;//             "[TParams;)",
a=0;//             "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask",
a=0;//             "<TParams;TProgress;TResult;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 552
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mStatus:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;);
a=0;//     sget-object v1, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;->PENDING:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 553
a=0;//     invoke-static {}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->$SWITCH_TABLE$com$lidroid$xutils$util$core$CompatibleAsyncTask$Status()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mStatus:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 566
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;->RUNNING:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mStatus:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;//     .line 568
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->onPreExecute()V
a=0;// 
a=0;//     .line 570
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mWorker:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$WorkerRunnable;
a=0;// 
a=0;//     iput-object p2, v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$WorkerRunnable;->mParams:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 571
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;//     invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 573
a=0;//     return-object p0
a=0;// 
a=0;//     .line 555
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Cannot execute task: the task is already running."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 558
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Cannot execute task: the task has already been executed (a task can be executed only once)"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 553
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final get()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/InterruptedException;,
a=0;//             Ljava/util/concurrent/ExecutionException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 469
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/FutureTask;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "timeout"    # J
a=0;//     .param p3, "unit"    # Ljava/util/concurrent/TimeUnit;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(J",
a=0;//             "Ljava/util/concurrent/TimeUnit;",
a=0;//             ")TResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/InterruptedException;,
a=0;//             Ljava/util/concurrent/ExecutionException;,
a=0;//             Ljava/util/concurrent/TimeoutException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 490
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/FutureTask;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getStatus()Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 323
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mStatus:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$Status;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final isCancelled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 421
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->mCancelled:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onCancelled()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 409
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCancelled(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TResult;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 393
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     .local p1, "result":Ljava/lang/Object;, "TResult;"
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->onCancelled()V
a=0;// 
a=0;//     .line 394
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TResult;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 364
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     .local p1, "result":Ljava/lang/Object;, "TResult;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPreExecute()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 349
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected varargs onProgressUpdate([Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p1, "values"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([TProgress;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 376
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final varargs publishProgress([Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;//     .param p1, "values"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([TProgress;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 602
a=0;//     .local p0, "this":Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;, "Lcom/lidroid/xutils/util/core/CompatibleAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->isCancelled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 603
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;->sHandler:Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 604
a=0;//     #v1=(PosByte);
a=0;//     new-instance v2, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;);
a=0;//     invoke-direct {v2, p0, p1}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;-><init>(Lcom/lidroid/xutils/util/core/CompatibleAsyncTask;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 603
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$AsyncTaskResult;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/lidroid/xutils/util/core/CompatibleAsyncTask$InternalHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 604
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 606
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
