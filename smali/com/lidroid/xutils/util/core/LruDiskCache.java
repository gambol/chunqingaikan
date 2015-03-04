package com.lidroid.xutils.util.core; class LruDiskCache { void a() { int a;
a=0;// .class public final Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LruDiskCache.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Closeable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;,
a=0;//         Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;,
a=0;//         Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;,
a=0;//         Lcom/lidroid/xutils/util/core/LruDiskCache$MD5DiskCacheFileNameGenerator;,
a=0;//         Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;,
a=0;//         Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final ANY_SEQUENCE_NUMBER:J = -0x1L
a=0;// 
a=0;// .field private static final CLEAN:Ljava/lang/String; = "CLEAN"
a=0;// 
a=0;// .field private static final DIRTY:Ljava/lang/String; = "DIRTY"
a=0;// 
a=0;// .field static final JOURNAL_FILE:Ljava/lang/String; = "journal"
a=0;// 
a=0;// .field static final JOURNAL_FILE_BACKUP:Ljava/lang/String; = "journal.bkp"
a=0;// 
a=0;// .field static final JOURNAL_FILE_TEMP:Ljava/lang/String; = "journal.tmp"
a=0;// 
a=0;// .field static final LEGAL_KEY_PATTERN:Ljava/util/regex/Pattern;
a=0;// 
a=0;// .field static final MAGIC:Ljava/lang/String; = "libcore.io.DiskLruCache"
a=0;// 
a=0;// .field private static final NULL_OUTPUT_STREAM:Ljava/io/OutputStream;
a=0;// 
a=0;// .field private static final READ:Ljava/lang/String; = "READ"
a=0;// 
a=0;// .field private static final REMOVE:Ljava/lang/String; = "REMOVE"
a=0;// 
a=0;// .field static final VERSION_1:Ljava/lang/String; = "1"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final appVersion:I
a=0;// 
a=0;// .field private final cleanupCallable:Ljava/util/concurrent/Callable;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/concurrent/Callable",
a=0;//             "<",
a=0;//             "Ljava/lang/Void;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final directory:Ljava/io/File;
a=0;// 
a=0;// .field private diskCacheFileNameGenerator:Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;
a=0;// 
a=0;// .field final executorService:Ljava/util/concurrent/ThreadPoolExecutor;
a=0;// 
a=0;// .field private final journalFile:Ljava/io/File;
a=0;// 
a=0;// .field private final journalFileBackup:Ljava/io/File;
a=0;// 
a=0;// .field private final journalFileTmp:Ljava/io/File;
a=0;// 
a=0;// .field private journalWriter:Ljava/io/Writer;
a=0;// 
a=0;// .field private final lruEntries:Ljava/util/LinkedHashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/LinkedHashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private maxSize:J
a=0;// 
a=0;// .field private nextSequenceNumber:J
a=0;// 
a=0;// .field private redundantOpCount:I
a=0;// 
a=0;// .field private size:J
a=0;// 
a=0;// .field private final valueCount:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     const-string v0, "[a-z0-9_-]{1,64}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/lidroid/xutils/util/core/LruDiskCache;->LEGAL_KEY_PATTERN:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     .line 785
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/LruDiskCache$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/LruDiskCache$2;);
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache$2;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$2;);
a=0;//     sput-object v0, Lcom/lidroid/xutils/util/core/LruDiskCache;->NULL_OUTPUT_STREAM:Ljava/io/OutputStream;
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Ljava/io/File;IIJ)V
a=0;//     .locals 7
a=0;//     .param p1, "directory"    # Ljava/io/File;
a=0;//     .param p2, "appVersion"    # I
a=0;//     .param p3, "valueCount"    # I
a=0;//     .param p4, "maxSize"    # J
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 174
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 140
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache;);
a=0;//     iput-wide v4, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->size:J
a=0;// 
a=0;//     .line 143
a=0;//     new-instance v0, Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedHashMap;);
a=0;//     const/high16 v3, 0x3f400000    # 0.75f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v0, v1, v3, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     .line 151
a=0;//     iput-wide v4, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->nextSequenceNumber:J
a=0;// 
a=0;//     .line 157
a=0;//     new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ThreadPoolExecutor;);
a=0;//     const-wide/16 v3, 0x3c
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/concurrent/TimeUnit;);
a=0;//     new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ThreadPoolExecutor;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->executorService:Ljava/util/concurrent/ThreadPoolExecutor;
a=0;// 
a=0;//     .line 158
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/LruDiskCache$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/LruDiskCache$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/lidroid/xutils/util/core/LruDiskCache$1;-><init>(Lcom/lidroid/xutils/util/core/LruDiskCache;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$1;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->cleanupCallable:Ljava/util/concurrent/Callable;
a=0;// 
a=0;//     .line 1241
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/LruDiskCache$MD5DiskCacheFileNameGenerator;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/LruDiskCache$MD5DiskCacheFileNameGenerator;);
a=0;//     invoke-direct {v0, p0}, Lcom/lidroid/xutils/util/core/LruDiskCache$MD5DiskCacheFileNameGenerator;-><init>(Lcom/lidroid/xutils/util/core/LruDiskCache;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$MD5DiskCacheFileNameGenerator;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->diskCacheFileNameGenerator:Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;
a=0;// 
a=0;//     .line 175
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->directory:Ljava/io/File;
a=0;// 
a=0;//     .line 176
a=0;//     iput p2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->appVersion:I
a=0;// 
a=0;//     .line 177
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v1, "journal"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFile:Ljava/io/File;
a=0;// 
a=0;//     .line 178
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v1, "journal.tmp"
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFileTmp:Ljava/io/File;
a=0;// 
a=0;//     .line 179
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v1, "journal.bkp"
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFileBackup:Ljava/io/File;
a=0;// 
a=0;//     .line 180
a=0;//     iput p3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->valueCount:I
a=0;// 
a=0;//     .line 181
a=0;//     iput-wide p4, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->maxSize:J
a=0;// 
a=0;//     .line 182
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/lidroid/xutils/util/core/LruDiskCache;)Ljava/io/Writer;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/Writer;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/lidroid/xutils/util/core/LruDiskCache;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 703
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->trimToSize()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/lidroid/xutils/util/core/LruDiskCache;Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;Z)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 559
a=0;//     invoke-direct {p0, p1, p2}, Lcom/lidroid/xutils/util/core/LruDiskCache;->completeEdit(Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/lidroid/xutils/util/core/LruDiskCache;Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 635
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/util/core/LruDiskCache;->removeByDiskKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/lidroid/xutils/util/core/LruDiskCache;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 618
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalRebuildRequired()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/lidroid/xutils/util/core/LruDiskCache;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 351
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->rebuildJournal()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/lidroid/xutils/util/core/LruDiskCache;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iput p1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->redundantOpCount:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/lidroid/xutils/util/core/LruDiskCache;Ljava/lang/String;J)Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 502
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/lidroid/xutils/util/core/LruDiskCache;->editByDiskKey(Ljava/lang/String;J)Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Ljava/io/InputStream;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 727
a=0;//     invoke-static {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->inputStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/lidroid/xutils/util/core/LruDiskCache;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->valueCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/lidroid/xutils/util/core/LruDiskCache;)Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->directory:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9()Ljava/io/OutputStream;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 785
a=0;//     sget-object v0, Lcom/lidroid/xutils/util/core/LruDiskCache;->NULL_OUTPUT_STREAM:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private checkNotClosed()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 671
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/Writer;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 672
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "cache is closed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 674
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized completeEdit(Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;Z)V
a=0;//     .locals 12
a=0;//     .param p1, "editor"    # Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;//     .param p2, "success"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 560
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p1}, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;->access$2(Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;)Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 561
a=0;//     .local v2, "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;);
a=0;//     invoke-static {v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$2(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     if-eq v8, p1, :cond_0
a=0;// 
a=0;//     .line 562
a=0;//     new-instance v8, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     invoke-direct {v8}, Ljava/lang/IllegalStateException;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v8
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 560
a=0;//     .end local v2    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v8
a=0;// 
a=0;//     .line 566
a=0;//     .restart local v2    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-static {v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$0(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_1
a=0;// 
a=0;//     .line 567
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v3=(Integer);
a=0;//     iget v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->valueCount:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lt v3, v8, :cond_5
a=0;// 
a=0;//     .line 579
a=0;//     .end local v3    # "i":I
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .restart local v3    # "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     iget v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->valueCount:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lt v3, v8, :cond_8
a=0;// 
a=0;//     .line 595
a=0;//     iget v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->redundantOpCount:I
a=0;// 
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     iput v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->redundantOpCount:I
a=0;// 
a=0;//     .line 596
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {v2, v8}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$6(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;)V
a=0;// 
a=0;//     .line 597
a=0;//     invoke-static {v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$0(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     or-int/2addr v8, p2
a=0;// 
a=0;//     if-eqz v8, :cond_b
a=0;// 
a=0;//     .line 598
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-static {v2, v8}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$5(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;Z)V
a=0;// 
a=0;//     .line 599
a=0;//     iget-object v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/Writer;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "CLEAN "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$3(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, " t_"
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$9(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)J
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     invoke-virtual {v9, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->getLengths()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const/16 v10, 0xa
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 600
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 601
a=0;//     iget-wide v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->nextSequenceNumber:J
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x1
a=0;// 
a=0;//     #v10=(LongLo);
a=0;//     add-long/2addr v10, v8
a=0;// 
a=0;//     iput-wide v10, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->nextSequenceNumber:J
a=0;// 
a=0;//     invoke-static {v2, v8, v9}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$11(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;J)V
a=0;// 
a=0;//     .line 607
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/Writer;);
a=0;//     invoke-virtual {v8}, Ljava/io/Writer;->flush()V
a=0;// 
a=0;//     .line 609
a=0;//     iget-wide v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->size:J
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     iget-wide v10, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->maxSize:J
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     cmp-long v8, v8, v10
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-gtz v8, :cond_3
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalRebuildRequired()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     .line 610
a=0;//     :cond_3
a=0;//     #v8=(Byte);
a=0;//     iget-object v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->executorService:Ljava/util/concurrent/ThreadPoolExecutor;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/concurrent/ThreadPoolExecutor;);
a=0;//     iget-object v9, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->cleanupCallable:Ljava/util/concurrent/Callable;
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/concurrent/Callable;);
a=0;//     invoke-virtual {v8, v9}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 612
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 568
a=0;//     :cond_5
a=0;//     :try_start_2
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Integer);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     invoke-static {p1}, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;->access$3(Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;)[Z
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,[Z);
a=0;//     aget-boolean v8, v8, v3
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_6
a=0;// 
a=0;//     .line 569
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;->abort()V
a=0;// 
a=0;//     .line 570
a=0;//     new-instance v8, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "Newly created entry didn\'t create value for index "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v8
a=0;// 
a=0;//     .line 572
a=0;//     :cond_6
a=0;//     #v8=(Boolean);v9=(Uninit);v10=(Uninit);
a=0;//     invoke-virtual {v2, v3}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->getDirtyFile(I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v8}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_7
a=0;// 
a=0;//     .line 573
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;->abort()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 567
a=0;//     :cond_7
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 580
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Integer);v9=(Conflicted);
a=0;//     invoke-virtual {v2, v3}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->getDirtyFile(I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 581
a=0;//     .local v1, "dirty":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     if-eqz p2, :cond_a
a=0;// 
a=0;//     .line 582
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     .line 583
a=0;//     invoke-virtual {v2, v3}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->getCleanFile(I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 584
a=0;//     .local v0, "clean":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     .line 585
a=0;//     invoke-static {v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$8(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)[J
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,[J);
a=0;//     aget-wide v6, v8, v3
a=0;// 
a=0;//     .line 586
a=0;//     .local v6, "oldLength":J
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 587
a=0;//     .local v4, "newLength":J
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$8(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)[J
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     aput-wide v4, v8, v3
a=0;// 
a=0;//     .line 588
a=0;//     iget-wide v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->size:J
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     sub-long/2addr v8, v6
a=0;// 
a=0;//     add-long/2addr v8, v4
a=0;// 
a=0;//     iput-wide v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->size:J
a=0;// 
a=0;//     .line 579
a=0;//     .end local v0    # "clean":Ljava/io/File;
a=0;//     .end local v4    # "newLength":J
a=0;//     .end local v6    # "oldLength":J
a=0;//     :cond_9
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 591
a=0;//     :cond_a
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v1}, Lcom/lidroid/xutils/util/core/LruDiskCache;->deleteIfExists(Ljava/io/File;)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 604
a=0;//     .end local v1    # "dirty":Ljava/io/File;
a=0;//     :cond_b
a=0;//     #v1=(Conflicted);v8=(Boolean);
a=0;//     iget-object v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-static {v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$3(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 605
a=0;//     iget-object v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "REMOVE "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$3(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const/16 v10, 0xa
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private static deleteContents(Ljava/io/File;)V
a=0;//     .locals 5
a=0;//     .param p0, "dir"    # Ljava/io/File;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1050
a=0;//     invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1051
a=0;//     .local v1, "files":[Ljava/io/File;
a=0;//     #v1=(Reference,[Ljava/io/File;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1052
a=0;//     new-instance v2, Ljava/io/IOException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/IOException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "not a readable directory: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 1054
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v4=(Conflicted);
a=0;//     if-lt v2, v3, :cond_1
a=0;// 
a=0;//     .line 1062
a=0;//     return-void
a=0;// 
a=0;//     .line 1054
a=0;//     :cond_1
a=0;//     aget-object v0, v1, v2
a=0;// 
a=0;//     .line 1055
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 1056
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->deleteContents(Ljava/io/File;)V
a=0;// 
a=0;//     .line 1058
a=0;//     :cond_2
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 1059
a=0;//     new-instance v2, Ljava/io/IOException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/IOException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "failed to delete file: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 1054
a=0;//     :cond_3
a=0;//     #v2=(Integer);v3=(Integer);v4=(Boolean);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static deleteIfExists(Ljava/io/File;)V
a=0;//     .locals 1
a=0;//     .param p0, "file"    # Ljava/io/File;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 392
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 393
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     invoke-direct {v0}, Ljava/io/IOException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 395
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized editByDiskKey(Ljava/lang/String;J)Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;//     .locals 5
a=0;//     .param p1, "diskKey"    # Ljava/lang/String;
a=0;//     .param p2, "expectedSequenceNumber"    # J
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 503
a=0;//     #v0=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->checkNotClosed()V
a=0;// 
a=0;//     .line 504
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/util/core/LruDiskCache;->validateKey(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 505
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;// 
a=0;//     .line 506
a=0;//     .local v1, "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     const-wide/16 v2, -0x1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, p2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 507
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {v1}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$10(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)J
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     cmp-long v2, v2, p2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 523
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 510
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Byte);v3=(LongHi);v4=(Uninit);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 511
a=0;//     :try_start_1
a=0;//     new-instance v1, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;// 
a=0;//     .end local v1    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, p0, p1, v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;-><init>(Lcom/lidroid/xutils/util/core/LruDiskCache;Ljava/lang/String;Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)V
a=0;// 
a=0;//     .line 512
a=0;//     .restart local v1    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v2, p1, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 517
a=0;//     :cond_2
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v0, p0, v1, v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;-><init>(Lcom/lidroid/xutils/util/core/LruDiskCache;Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;)V
a=0;// 
a=0;//     .line 518
a=0;//     .local v0, "editor":Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     invoke-static {v1, v0}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$6(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;)V
a=0;// 
a=0;//     .line 521
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/Writer;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "DIRTY "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/16 v4, 0xa
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 522
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/Writer;->flush()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 503
a=0;//     .end local v0    # "editor":Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;//     .end local v1    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v2
a=0;// 
a=0;//     .line 513
a=0;//     .restart local v1    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v0=(Null);v1=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;);v2=(Byte);v3=(LongHi);v4=(Uninit);
a=0;//     invoke-static {v1}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$2(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized getByDiskKey(Ljava/lang/String;)Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;
a=0;//     .locals 12
a=0;//     .param p1, "diskKey"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 434
a=0;//     #v0=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->checkNotClosed()V
a=0;// 
a=0;//     .line 435
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/util/core/LruDiskCache;->validateKey(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 436
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v9, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 437
a=0;//     .local v9, "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     if-nez v9, :cond_1
a=0;// 
a=0;//     .line 490
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 441
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Null);v1=(Reference,Ljava/util/LinkedHashMap;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     invoke-static {v9}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$0(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 446
a=0;//     invoke-static {v9}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$9(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_4
a=0;// 
a=0;//     .line 447
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .local v11, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v10=(Conflicted);v11=(Integer);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->valueCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v11, v1, :cond_2
a=0;// 
a=0;//     .line 455
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->redundantOpCount:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->redundantOpCount:I
a=0;// 
a=0;//     .line 456
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/Writer;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "REMOVE "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 457
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 458
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalRebuildRequired()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 459
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->executorService:Ljava/util/concurrent/ThreadPoolExecutor;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/ThreadPoolExecutor;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->cleanupCallable:Ljava/util/concurrent/Callable;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 434
a=0;//     .end local v9    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     .end local v11    # "i":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 448
a=0;//     .restart local v9    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     .restart local v11    # "i":I
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v0=(Null);v1=(Integer);v4=(LongHi);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;);v11=(Integer);
a=0;//     invoke-virtual {v9, v11}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->getCleanFile(I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 449
a=0;//     .local v10, "file":Ljava/io/File;
a=0;//     #v10=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v10}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 450
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "failed to delete "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 452
a=0;//     :cond_3
a=0;//     #v0=(Null);v1=(Boolean);v2=(Conflicted);
a=0;//     iget-wide v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->size:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v9}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$8(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)[J
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[J);
a=0;//     aget-wide v3, v3, v11
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     sub-long/2addr v1, v3
a=0;// 
a=0;//     iput-wide v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->size:J
a=0;// 
a=0;//     .line 453
a=0;//     invoke-static {v9}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$8(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)[J
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[J);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     aput-wide v2, v1, v11
a=0;// 
a=0;//     .line 447
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 467
a=0;//     .end local v10    # "file":Ljava/io/File;
a=0;//     .end local v11    # "i":I
a=0;//     :cond_4
a=0;//     #v1=(Byte);v2=(LongHi);v3=(LongLo);v10=(Uninit);v11=(Uninit);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->valueCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v5, v1, [Ljava/io/FileInputStream;
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 469
a=0;//     .local v5, "ins":[Ljava/io/FileInputStream;
a=0;//     #v5=(Reference,[Ljava/io/FileInputStream;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .restart local v11    # "i":I
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v11=(Integer);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->valueCount:I
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v11, v1, :cond_6
a=0;// 
a=0;//     .line 484
a=0;//     :try_start_4
a=0;//     iget v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->redundantOpCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->redundantOpCount:I
a=0;// 
a=0;//     .line 485
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/Writer;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "READ "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 486
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalRebuildRequired()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 487
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->executorService:Ljava/util/concurrent/ThreadPoolExecutor;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ThreadPoolExecutor;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->cleanupCallable:Ljava/util/concurrent/Callable;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
a=0;// 
a=0;//     .line 490
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;);
a=0;//     invoke-static {v9}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$10(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     invoke-static {v9}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$8(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)[J
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,[J);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;-><init>(Lcom/lidroid/xutils/util/core/LruDiskCache;Ljava/lang/String;J[Ljava/io/FileInputStream;[JLcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;)V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 470
a=0;//     :cond_6
a=0;//     :try_start_5
a=0;//     #v0=(Null);v1=(Integer);v2=(Conflicted);v6=(Uninit);v7=(Uninit);
a=0;//     new-instance v1, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-virtual {v9, v11}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->getCleanFile(I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     aput-object v1, v5, v11
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     .line 469
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 472
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 474
a=0;//     .local v8, "e":Ljava/io/FileNotFoundException;
a=0;//     #v8=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_6
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->valueCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v11, v1, :cond_0
a=0;// 
a=0;//     .line 475
a=0;//     aget-object v1, v5, v11
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 476
a=0;//     aget-object v1, v5, v11
a=0;// 
a=0;//     invoke-static {v1}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     .line 474
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private static inputStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "in"    # Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 728
a=0;//     new-instance v0, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, p0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->readFully(Ljava/io/Reader;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private journalRebuildRequired()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 619
a=0;//     const/16 v0, 0x7d0
a=0;// 
a=0;//     .line 620
a=0;//     .local v0, "redundantOpCompactThreshold":I
a=0;//     #v0=(PosShort);
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->redundantOpCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x7d0
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 621
a=0;//     iget v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->redundantOpCount:I
a=0;// 
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v2}, Ljava/util/LinkedHashMap;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 620
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static open(Ljava/io/File;IIJ)Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;//     .locals 10
a=0;//     .param p0, "directory"    # Ljava/io/File;
a=0;//     .param p1, "appVersion"    # I
a=0;//     .param p2, "valueCount"    # I
a=0;//     .param p3, "maxSize"    # J
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     cmp-long v1, p3, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     .line 196
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v2, "maxSize <= 0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 198
a=0;//     :cond_0
a=0;//     #v1=(Byte);v2=(LongHi);
a=0;//     if-gtz p2, :cond_1
a=0;// 
a=0;//     .line 199
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v2, "valueCount <= 0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 203
a=0;//     :cond_1
a=0;//     #v1=(Byte);v2=(LongHi);
a=0;//     new-instance v6, Ljava/io/File;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/File;);
a=0;//     const-string v1, "journal.bkp"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 204
a=0;//     .local v6, "backupFile":Ljava/io/File;
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v6}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 205
a=0;//     new-instance v8, Ljava/io/File;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/io/File;);
a=0;//     const-string v1, "journal"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 207
a=0;//     .local v8, "journalFile":Ljava/io/File;
a=0;//     #v8=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v8}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {v6}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 215
a=0;//     .end local v8    # "journalFile":Ljava/io/File;
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v8=(Conflicted);
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/LruDiskCache;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-wide v4, p3
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/lidroid/xutils/util/core/LruDiskCache;-><init>(Ljava/io/File;IIJ)V
a=0;// 
a=0;//     .line 216
a=0;//     .local v0, "cache":Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache;);
a=0;//     iget-object v1, v0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFile:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 218
a=0;//     :try_start_0
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->readJournal()V
a=0;// 
a=0;//     .line 219
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->processJournal()V
a=0;// 
a=0;//     .line 220
a=0;//     new-instance v1, Ljava/io/BufferedWriter;
a=0;// 
a=0;//     .line 221
a=0;//     #v1=(UninitRef,Ljava/io/BufferedWriter;);
a=0;//     new-instance v2, Ljava/io/OutputStreamWriter;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/OutputStreamWriter;);
a=0;//     new-instance v3, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     iget-object v4, v0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFile:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-direct {v3, v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const-string v4, "US-ASCII"
a=0;// 
a=0;//     invoke-direct {v2, v3, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/OutputStreamWriter;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     .line 220
a=0;//     #v1=(Reference,Ljava/io/BufferedWriter;);
a=0;//     iput-object v1, v0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object v7, v0
a=0;// 
a=0;//     .line 237
a=0;//     .end local v0    # "cache":Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;//     .local v7, "cache":Ljava/lang/Object;
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache;);v9=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 210
a=0;//     .end local v7    # "cache":Ljava/lang/Object;
a=0;//     .restart local v8    # "journalFile":Ljava/io/File;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(LongHi);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Reference,Ljava/io/File;);v9=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v6, v8, v1}, Lcom/lidroid/xutils/util/core/LruDiskCache;->renameTo(Ljava/io/File;Ljava/io/File;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 223
a=0;//     .end local v8    # "journalFile":Ljava/io/File;
a=0;//     .restart local v0    # "cache":Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;//     :catch_0
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 224
a=0;//     .local v9, "journalIsCorrupt":Ljava/lang/Throwable;
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "DiskLruCache "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 225
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 226
a=0;//     const-string v2, " is corrupt: "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 227
a=0;//     invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 228
a=0;//     const-string v2, ", removing"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 224
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v9}, Lcom/lidroid/xutils/util/LogUtils;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 229
a=0;//     invoke-virtual {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->delete()V
a=0;// 
a=0;//     .line 234
a=0;//     .end local v9    # "journalIsCorrupt":Ljava/lang/Throwable;
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 235
a=0;//     new-instance v0, Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// 
a=0;//     .end local v0    # "cache":Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/util/core/LruDiskCache;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-wide v4, p3
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/lidroid/xutils/util/core/LruDiskCache;-><init>(Ljava/io/File;IIJ)V
a=0;// 
a=0;//     .line 236
a=0;//     .restart local v0    # "cache":Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache;);
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->rebuildJournal()V
a=0;// 
a=0;//     move-object v7, v0
a=0;// 
a=0;//     .line 237
a=0;//     .restart local v7    # "cache":Ljava/lang/Object;
a=0;//     #v7=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private processJournal()V
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 329
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFileTmp:Ljava/io/File;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v3}, Lcom/lidroid/xutils/util/core/LruDiskCache;->deleteIfExists(Ljava/io/File;)V
a=0;// 
a=0;//     .line 330
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;>;"
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 345
a=0;//     return-void
a=0;// 
a=0;//     .line 331
a=0;//     :cond_1
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;// 
a=0;//     .line 332
a=0;//     .local v0, "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$2(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 333
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "t":I
a=0;//     :goto_1
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     iget v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->valueCount:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     .line 334
a=0;//     iget-wide v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->size:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$8(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)[J
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[J);
a=0;//     aget-wide v5, v5, v2
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     add-long/2addr v3, v5
a=0;// 
a=0;//     iput-wide v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->size:J
a=0;// 
a=0;//     .line 333
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 337
a=0;//     .end local v2    # "t":I
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v0, v3}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$6(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;)V
a=0;// 
a=0;//     .line 338
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .restart local v2    # "t":I
a=0;//     :goto_2
a=0;//     #v2=(Integer);v3=(Reference,Ljava/io/File;);
a=0;//     iget v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->valueCount:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v2, v3, :cond_3
a=0;// 
a=0;//     .line 342
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->remove()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 339
a=0;//     :cond_3
a=0;//     invoke-virtual {v0, v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->getCleanFile(I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v3}, Lcom/lidroid/xutils/util/core/LruDiskCache;->deleteIfExists(Ljava/io/File;)V
a=0;// 
a=0;//     .line 340
a=0;//     invoke-virtual {v0, v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->getDirtyFile(I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/lidroid/xutils/util/core/LruDiskCache;->deleteIfExists(Ljava/io/File;)V
a=0;// 
a=0;//     .line 338
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private static readFully(Ljava/io/Reader;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p0, "reader"    # Ljava/io/Reader;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1030
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1032
a=0;//     .local v2, "writer":Ljava/io/StringWriter;
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/io/StringWriter;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/StringWriter;);
a=0;//     invoke-direct {v3}, Ljava/io/StringWriter;-><init>()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 1033
a=0;//     .end local v2    # "writer":Ljava/io/StringWriter;
a=0;//     .local v3, "writer":Ljava/io/StringWriter;
a=0;//     #v3=(Reference,Ljava/io/StringWriter;);
a=0;//     const/16 v4, 0x400
a=0;// 
a=0;//     :try_start_1
a=0;//     #v4=(PosShort);
a=0;//     new-array v0, v4, [C
a=0;// 
a=0;//     .line 1035
a=0;//     .local v0, "buffer":[C
a=0;//     :goto_0
a=0;//     #v0=(Reference,[C);v1=(Conflicted);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/Reader;->read([C)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v1, v4, :cond_0
a=0;// 
a=0;//     .line 1038
a=0;//     invoke-virtual {v3}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1040
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 1041
a=0;//     invoke-static {v3}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 1038
a=0;//     return-object v4
a=0;// 
a=0;//     .line 1036
a=0;//     :cond_0
a=0;//     #v4=(Byte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v0, v4, v1}, Ljava/io/StringWriter;->write([CII)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1039
a=0;//     .end local v0    # "buffer":[C
a=0;//     .end local v1    # "count":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Short);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 1040
a=0;//     .end local v3    # "writer":Ljava/io/StringWriter;
a=0;//     .restart local v2    # "writer":Ljava/io/StringWriter;
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/io/StringWriter;);v3=(Conflicted);
a=0;//     invoke-static {p0}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 1041
a=0;//     invoke-static {v2}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 1042
a=0;//     throw v4
a=0;// 
a=0;//     .line 1039
a=0;//     :catchall_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v4=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private readJournal()V
a=0;//     .locals 11
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 243
a=0;//     .local v4, "reader":Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     new-instance v5, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;);
a=0;//     new-instance v8, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     iget-object v9, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFile:Ljava/io/File;
a=0;// 
a=0;//     #v9=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v8, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v5, p0, v8}, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;-><init>(Lcom/lidroid/xutils/util/core/LruDiskCache;Ljava/io/InputStream;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 244
a=0;//     .end local v4    # "reader":Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;
a=0;//     .local v5, "reader":Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;
a=0;//     :try_start_1
a=0;//     #v5=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;);
a=0;//     invoke-virtual {v5}, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 245
a=0;//     .local v3, "magic":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 246
a=0;//     .local v7, "version":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 247
a=0;//     .local v0, "appVersionString":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 248
a=0;//     .local v6, "valueCountString":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 249
a=0;//     .local v1, "blank":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "libcore.io.DiskLruCache"
a=0;// 
a=0;//     invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 250
a=0;//     const-string v8, "1"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 251
a=0;//     iget v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->appVersion:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 252
a=0;//     iget v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->valueCount:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 253
a=0;//     const-string v8, ""
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_1
a=0;// 
a=0;//     .line 254
a=0;//     :cond_0
a=0;//     new-instance v8, Ljava/io/IOException;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/io/IOException;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "unexpected journal header: ["
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, ", "
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, ", "
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 255
a=0;//     invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, ", "
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, "]"
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 254
a=0;//     invoke-direct {v8, v9}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/IOException;);
a=0;//     throw v8
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 268
a=0;//     .end local v0    # "appVersionString":Ljava/lang/String;
a=0;//     .end local v1    # "blank":Ljava/lang/String;
a=0;//     .end local v3    # "magic":Ljava/lang/String;
a=0;//     .end local v6    # "valueCountString":Ljava/lang/String;
a=0;//     .end local v7    # "version":Ljava/lang/String;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 269
a=0;//     .end local v5    # "reader":Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;
a=0;//     .restart local v4    # "reader":Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;
a=0;//     :goto_0
a=0;//     #v4=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;);v5=(Conflicted);
a=0;//     invoke-static {v4}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 270
a=0;//     throw v8
a=0;// 
a=0;//     .line 258
a=0;//     .end local v4    # "reader":Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;
a=0;//     .restart local v0    # "appVersionString":Ljava/lang/String;
a=0;//     .restart local v1    # "blank":Ljava/lang/String;
a=0;//     .restart local v3    # "magic":Ljava/lang/String;
a=0;//     .restart local v5    # "reader":Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;
a=0;//     .restart local v6    # "valueCountString":Ljava/lang/String;
a=0;//     .restart local v7    # "version":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Reference,Ljava/lang/String;);v4=(Null);v5=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);v8=(Boolean);v9=(Reference,Ljava/io/File;);v10=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 261
a=0;//     .local v2, "lineCount":I
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v2=(Integer);v8=(Conflicted);
a=0;//     invoke-virtual {v5}, Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v8}, Lcom/lidroid/xutils/util/core/LruDiskCache;->readJournalLine(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 262
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 263
a=0;//     :catch_0
a=0;//     #v8=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 267
a=0;//     :try_start_3
a=0;//     #v8=(Reference,Ljava/io/EOFException;);
a=0;//     iget-object v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/util/LinkedHashMap;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int v8, v2, v8
a=0;// 
a=0;//     iput v8, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->redundantOpCount:I
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 269
a=0;//     invoke-static {v5}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 271
a=0;//     return-void
a=0;// 
a=0;//     .line 268
a=0;//     .end local v0    # "appVersionString":Ljava/lang/String;
a=0;//     .end local v1    # "blank":Ljava/lang/String;
a=0;//     .end local v2    # "lineCount":I
a=0;//     .end local v3    # "magic":Ljava/lang/String;
a=0;//     .end local v5    # "reader":Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;
a=0;//     .end local v6    # "valueCountString":Ljava/lang/String;
a=0;//     .end local v7    # "version":Ljava/lang/String;
a=0;//     .restart local v4    # "reader":Lcom/lidroid/xutils/util/core/LruDiskCache$StrictLineReader;
a=0;//     :catchall_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Conflicted);v6=(Uninit);v7=(Uninit);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private readJournalLine(Ljava/lang/String;)V
a=0;//     .locals 11
a=0;//     .param p1, "line"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0x20
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     .line 274
a=0;//     #v8=(Byte);
a=0;//     invoke-virtual {p1, v7}, Ljava/lang/String;->indexOf(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 275
a=0;//     .local v3, "firstSpace":I
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v8, :cond_0
a=0;// 
a=0;//     .line 276
a=0;//     new-instance v7, Ljava/io/IOException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/IOException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "unexpected journal line: "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/IOException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 279
a=0;//     :cond_0
a=0;//     #v7=(PosByte);v8=(Byte);v9=(Null);
a=0;//     add-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     .line 280
a=0;//     .local v4, "keyBegin":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1, v7, v4}, Ljava/lang/String;->indexOf(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 282
a=0;//     .local v6, "secondSpace":I
a=0;//     #v6=(Integer);
a=0;//     if-ne v6, v8, :cond_2
a=0;// 
a=0;//     .line 283
a=0;//     invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 284
a=0;//     .local v0, "diskKey":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "REMOVE"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v3, v7, :cond_3
a=0;// 
a=0;//     const-string v7, "REMOVE"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 285
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v7, v0}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 322
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 289
a=0;//     .end local v0    # "diskKey":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(Uninit);v5=(Uninit);v7=(PosByte);v8=(Byte);
a=0;//     invoke-virtual {p1, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 292
a=0;//     .restart local v0    # "diskKey":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v7=(Integer);
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v7, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;// 
a=0;//     .line 293
a=0;//     .local v2, "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 294
a=0;//     new-instance v2, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;// 
a=0;//     .end local v2    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     #v2=(UninitRef,Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;);
a=0;//     invoke-direct {v2, p0, v0, v9}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;-><init>(Lcom/lidroid/xutils/util/core/LruDiskCache;Ljava/lang/String;Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)V
a=0;// 
a=0;//     .line 295
a=0;//     .restart local v2    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;);
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     invoke-virtual {v7, v0, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 298
a=0;//     :cond_4
a=0;//     if-eq v6, v8, :cond_6
a=0;// 
a=0;//     const-string v7, "CLEAN"
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v3, v7, :cond_6
a=0;// 
a=0;//     const-string v7, "CLEAN"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     .line 299
a=0;//     invoke-static {v2, v10}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$5(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;Z)V
a=0;// 
a=0;//     .line 300
a=0;//     invoke-static {v2, v9}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$6(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;)V
a=0;// 
a=0;//     .line 301
a=0;//     add-int/lit8 v7, v6, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, " "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 302
a=0;//     .local v5, "parts":[Ljava/lang/String;
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     array-length v7, v5
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lez v7, :cond_1
a=0;// 
a=0;//     .line 304
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v7=(Null);
a=0;//     aget-object v7, v5, v7
a=0;// 
a=0;//     const-string v8, "t_"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 305
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aget-object v7, v5, v7
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/Long;->longValue()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-static {v2, v7, v8}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$1(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;J)V
a=0;// 
a=0;//     .line 306
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-static {v2, v5, v7}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$7(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;[Ljava/lang/String;I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 311
a=0;//     :catch_0
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 312
a=0;//     .local v1, "e":Ljava/lang/Throwable;
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     new-instance v7, Ljava/io/IOException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/IOException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "unexpected journal line: "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/IOException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 308
a=0;//     .end local v1    # "e":Ljava/lang/Throwable;
a=0;//     :cond_5
a=0;//     #v1=(Uninit);v7=(Boolean);v9=(Null);
a=0;//     const-wide v7, 0x7fffffffffffffffL
a=0;// 
a=0;//     :try_start_1
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-static {v2, v7, v8}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$1(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;J)V
a=0;// 
a=0;//     .line 309
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v2, v5, v7}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$7(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;[Ljava/lang/String;I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 315
a=0;//     .end local v5    # "parts":[Ljava/lang/String;
a=0;//     :cond_6
a=0;//     #v5=(Uninit);v7=(Conflicted);v8=(Byte);
a=0;//     if-ne v6, v8, :cond_7
a=0;// 
a=0;//     const-string v7, "DIRTY"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v3, v7, :cond_7
a=0;// 
a=0;//     const-string v7, "DIRTY"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_7
a=0;// 
a=0;//     .line 316
a=0;//     new-instance v7, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     invoke-direct {v7, p0, v2, v9}, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;-><init>(Lcom/lidroid/xutils/util/core/LruDiskCache;Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     invoke-static {v2, v7}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$6(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 317
a=0;//     :cond_7
a=0;//     #v7=(Conflicted);
a=0;//     if-ne v6, v8, :cond_8
a=0;// 
a=0;//     const-string v7, "READ"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v3, v7, :cond_8
a=0;// 
a=0;//     const-string v7, "READ"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 320
a=0;//     :cond_8
a=0;//     #v7=(Conflicted);
a=0;//     new-instance v7, Ljava/io/IOException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/IOException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "unexpected journal line: "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/IOException;);
a=0;//     throw v7
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized rebuildJournal()V
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 352
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/Writer;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 353
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 356
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 358
a=0;//     .local v1, "writer":Ljava/io/Writer;
a=0;//     :try_start_1
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Ljava/io/BufferedWriter;
a=0;// 
a=0;//     .line 359
a=0;//     #v2=(UninitRef,Ljava/io/BufferedWriter;);
a=0;//     new-instance v3, Ljava/io/OutputStreamWriter;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/OutputStreamWriter;);
a=0;//     new-instance v4, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFileTmp:Ljava/io/File;
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const-string v5, "US-ASCII"
a=0;// 
a=0;//     invoke-direct {v3, v4, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 358
a=0;//     #v3=(Reference,Ljava/io/OutputStreamWriter;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_2
a=0;// 
a=0;//     .line 360
a=0;//     .end local v1    # "writer":Ljava/io/Writer;
a=0;//     .local v2, "writer":Ljava/io/Writer;
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/io/BufferedWriter;);
a=0;//     const-string v3, "libcore.io.DiskLruCache"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 361
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 362
a=0;//     const-string v3, "1"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 363
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 364
a=0;//     iget v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->appVersion:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 365
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 366
a=0;//     iget v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->valueCount:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 367
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 368
a=0;//     const-string v3, "\n"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 370
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 378
a=0;//     :try_start_3
a=0;//     invoke-static {v2}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 381
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFile:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 382
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFile:Ljava/io/File;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFileBackup:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-static {v3, v4, v5}, Lcom/lidroid/xutils/util/core/LruDiskCache;->renameTo(Ljava/io/File;Ljava/io/File;Z)V
a=0;// 
a=0;//     .line 384
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFileTmp:Ljava/io/File;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFile:Ljava/io/File;
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, v4, v5}, Lcom/lidroid/xutils/util/core/LruDiskCache;->renameTo(Ljava/io/File;Ljava/io/File;Z)V
a=0;// 
a=0;//     .line 385
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFileBackup:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 387
a=0;//     new-instance v3, Ljava/io/BufferedWriter;
a=0;// 
a=0;//     .line 388
a=0;//     #v3=(UninitRef,Ljava/io/BufferedWriter;);
a=0;//     new-instance v4, Ljava/io/OutputStreamWriter;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/OutputStreamWriter;);
a=0;//     new-instance v5, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     iget-object v6, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalFile:Ljava/io/File;
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-direct {v5, v6, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const-string v6, "US-ASCII"
a=0;// 
a=0;//     invoke-direct {v4, v5, v6}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/OutputStreamWriter;);
a=0;//     invoke-direct {v3, v4}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
a=0;// 
a=0;//     .line 387
a=0;//     #v3=(Reference,Ljava/io/BufferedWriter;);
a=0;//     iput-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 389
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 370
a=0;//     :cond_2
a=0;//     :try_start_4
a=0;//     #v4=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Uninit);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;// 
a=0;//     .line 371
a=0;//     .local v0, "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$2(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 372
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "DIRTY "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$3(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 377
a=0;//     .end local v0    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 378
a=0;//     .end local v2    # "writer":Ljava/io/Writer;
a=0;//     .restart local v1    # "writer":Ljava/io/Writer;
a=0;//     :goto_1
a=0;//     :try_start_5
a=0;//     #v1=(Reference,Ljava/io/BufferedWriter;);v2=(Conflicted);
a=0;//     invoke-static {v1}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 379
a=0;//     throw v3
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     .line 352
a=0;//     .end local v1    # "writer":Ljava/io/Writer;
a=0;//     :catchall_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 374
a=0;//     .restart local v0    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     .restart local v2    # "writer":Ljava/io/Writer;
a=0;//     :cond_3
a=0;//     :try_start_6
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;);v1=(Null);v2=(Reference,Ljava/io/BufferedWriter;);v4=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);v7=(Uninit);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "CLEAN "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$3(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " t_"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$9(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->getLengths()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V
a=0;//     :try_end_6
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 377
a=0;//     .end local v0    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     .end local v2    # "writer":Ljava/io/Writer;
a=0;//     .restart local v1    # "writer":Ljava/io/Writer;
a=0;//     :catchall_2
a=0;//     #v0=(Uninit);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized removeByDiskKey(Ljava/lang/String;)Z
a=0;//     .locals 7
a=0;//     .param p1, "diskKey"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 636
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->checkNotClosed()V
a=0;// 
a=0;//     .line 637
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/util/core/LruDiskCache;->validateKey(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 638
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v3, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;// 
a=0;//     .line 639
a=0;//     .local v0, "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$2(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 640
a=0;//     :cond_0
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 660
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v3
a=0;// 
a=0;//     .line 643
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->valueCount:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v2, v3, :cond_3
a=0;// 
a=0;//     .line 652
a=0;//     iget v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->redundantOpCount:I
a=0;// 
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     iput v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->redundantOpCount:I
a=0;// 
a=0;//     .line 653
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/Writer;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "REMOVE "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/16 v5, 0xa
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 654
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 656
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalRebuildRequired()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 657
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->executorService:Ljava/util/concurrent/ThreadPoolExecutor;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/ThreadPoolExecutor;);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->cleanupCallable:Ljava/util/concurrent/Callable;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
a=0;// 
a=0;//     .line 660
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 644
a=0;//     :cond_3
a=0;//     #v3=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v0, v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->getCleanFile(I)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 645
a=0;//     .local v1, "file":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 646
a=0;//     new-instance v3, Ljava/io/IOException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/IOException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "failed to delete "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     throw v3
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 636
a=0;//     .end local v0    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     .end local v1    # "file":Ljava/io/File;
a=0;//     .end local v2    # "i":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 648
a=0;//     .restart local v0    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     .restart local v1    # "file":Ljava/io/File;
a=0;//     .restart local v2    # "i":I
a=0;//     :cond_4
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;);v1=(Reference,Ljava/io/File;);v2=(Integer);v3=(Boolean);
a=0;//     iget-wide v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->size:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$8(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)[J
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,[J);
a=0;//     aget-wide v5, v5, v2
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     sub-long/2addr v3, v5
a=0;// 
a=0;//     iput-wide v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->size:J
a=0;// 
a=0;//     .line 649
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$8(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)[J
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[J);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     aput-wide v4, v3, v2
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 643
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static renameTo(Ljava/io/File;Ljava/io/File;Z)V
a=0;//     .locals 1
a=0;//     .param p0, "from"    # Ljava/io/File;
a=0;//     .param p1, "to"    # Ljava/io/File;
a=0;//     .param p2, "deleteDestination"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 398
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 399
a=0;//     invoke-static {p1}, Lcom/lidroid/xutils/util/core/LruDiskCache;->deleteIfExists(Ljava/io/File;)V
a=0;// 
a=0;//     .line 401
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 402
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     invoke-direct {v0}, Ljava/io/IOException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 404
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private trimToSize()V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 704
a=0;//     :goto_0
a=0;//     iget-wide v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->size:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->maxSize:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     .line 708
a=0;//     return-void
a=0;// 
a=0;//     .line 705
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 706
a=0;//     .local v0, "toEvict":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;>;"
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/lidroid/xutils/util/core/LruDiskCache;->removeByDiskKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private validateKey(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "diskKey"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 721
a=0;//     sget-object v1, Lcom/lidroid/xutils/util/core/LruDiskCache;->LEGAL_KEY_PATTERN:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/regex/Pattern;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 722
a=0;//     .local v0, "matcher":Ljava/util/regex/Matcher;
a=0;//     #v0=(Reference,Ljava/util/regex/Matcher;);
a=0;//     invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 723
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "keys must match regex [a-z0-9_-]{1,64}: \""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\""
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 725
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public declared-synchronized close()V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 690
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/Writer;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 701
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 693
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 698
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->trimToSize()V
a=0;// 
a=0;//     .line 699
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/Writer;->close()V
a=0;// 
a=0;//     .line 700
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 690
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     .line 693
a=0;//     :cond_2
a=0;//     :try_start_2
a=0;//     #v2=(Boolean);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;// 
a=0;//     .line 694
a=0;//     .local v0, "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$2(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 695
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$2(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;->abort()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public delete()V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 716
a=0;//     invoke-static {p0}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 717
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->directory:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->deleteContents(Ljava/io/File;)V
a=0;// 
a=0;//     .line 718
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public edit(Ljava/lang/String;)Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;//     .locals 3
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 498
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->diskCacheFileNameGenerator:Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;);
a=0;//     invoke-interface {v1, p1}, Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;->generate(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 499
a=0;//     .local v0, "diskKey":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v1, -0x1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-direct {p0, v0, v1, v2}, Lcom/lidroid/xutils/util/core/LruDiskCache;->editByDiskKey(Ljava/lang/String;J)Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized flush()V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 680
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->checkNotClosed()V
a=0;// 
a=0;//     .line 681
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->trimToSize()V
a=0;// 
a=0;//     .line 682
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/Writer;);
a=0;//     invoke-virtual {v0}, Ljava/io/Writer;->flush()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 683
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 680
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;)Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 424
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->diskCacheFileNameGenerator:Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;);
a=0;//     invoke-interface {v1, p1}, Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;->generate(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 425
a=0;//     .local v0, "diskKey":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->getByDiskKey(Ljava/lang/String;)Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public getCacheFile(Ljava/lang/String;I)Ljava/io/File;
a=0;//     .locals 5
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 419
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->diskCacheFileNameGenerator:Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;);
a=0;//     invoke-interface {v1, p1}, Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;->generate(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 420
a=0;//     .local v0, "diskKey":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->directory:Ljava/io/File;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "."
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public getDirectory()Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 530
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->directory:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDiskCacheFileNameGenerator()Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1244
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->diskCacheFileNameGenerator:Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized getExpiryTimestamp(Ljava/lang/String;)J
a=0;//     .locals 4
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 407
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->diskCacheFileNameGenerator:Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;);
a=0;//     invoke-interface {v2, p1}, Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;->generate(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 408
a=0;//     .local v0, "diskKey":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->checkNotClosed()V
a=0;// 
a=0;//     .line 409
a=0;//     invoke-direct {p0, v0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->validateKey(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 410
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->lruEntries:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 411
a=0;//     .local v1, "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 412
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     .line 414
a=0;//     :goto_0
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-wide v2
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/util/LinkedHashMap;);v3=(Uninit);
a=0;//     invoke-static {v1}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->access$9(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)J
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 407
a=0;//     .end local v0    # "diskKey":Ljava/lang/String;
a=0;//     .end local v1    # "entry":Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized getMaxSize()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 538
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-wide v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->maxSize:J
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-wide v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized isClosed()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 667
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->journalWriter:Ljava/io/Writer;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/Writer;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/Writer;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public remove(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 625
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->diskCacheFileNameGenerator:Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;);
a=0;//     invoke-interface {v1, p1}, Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;->generate(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 626
a=0;//     .local v0, "diskKey":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->removeByDiskKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public setDiskCacheFileNameGenerator(Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;)V
a=0;//     .locals 0
a=0;//     .param p1, "diskCacheFileNameGenerator"    # Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1248
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 1249
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->diskCacheFileNameGenerator:Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;
a=0;// 
a=0;//     .line 1251
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized setMaxSize(J)V
a=0;//     .locals 2
a=0;//     .param p1, "maxSize"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 546
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iput-wide p1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->maxSize:J
a=0;// 
a=0;//     .line 547
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->executorService:Ljava/util/concurrent/ThreadPoolExecutor;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ThreadPoolExecutor;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->cleanupCallable:Ljava/util/concurrent/Callable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/Callable;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 548
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 546
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized size()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 556
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-wide v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache;->size:J
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-wide v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
