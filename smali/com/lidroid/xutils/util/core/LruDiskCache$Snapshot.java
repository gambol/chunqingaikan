package com.lidroid.xutils.util.core; class LruDiskCache$Snapshot { void a() { int a;
a=0;// .class public final Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LruDiskCache.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/io/Closeable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x11
a=0;//     name = "Snapshot"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final diskKey:Ljava/lang/String;
a=0;// 
a=0;// .field private final ins:[Ljava/io/FileInputStream;
a=0;// 
a=0;// .field private final lengths:[J
a=0;// 
a=0;// .field private final sequenceNumber:J
a=0;// 
a=0;// .field final synthetic this$0:Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/lidroid/xutils/util/core/LruDiskCache;Ljava/lang/String;J[Ljava/io/FileInputStream;[J)V
a=0;//     .locals 0
a=0;//     .param p2, "diskKey"    # Ljava/lang/String;
a=0;//     .param p3, "sequenceNumber"    # J
a=0;//     .param p5, "ins"    # [Ljava/io/FileInputStream;
a=0;//     .param p6, "lengths"    # [J
a=0;// 
a=0;//     .prologue
a=0;//     .line 740
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;->this$0:Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 741
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;);
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;->diskKey:Ljava/lang/String;
a=0;// 
a=0;//     .line 742
a=0;//     iput-wide p3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;->sequenceNumber:J
a=0;// 
a=0;//     .line 743
a=0;//     iput-object p5, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;->ins:[Ljava/io/FileInputStream;
a=0;// 
a=0;//     .line 744
a=0;//     iput-object p6, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;->lengths:[J
a=0;// 
a=0;//     .line 745
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/lidroid/xutils/util/core/LruDiskCache;Ljava/lang/String;J[Ljava/io/FileInputStream;[JLcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 740
a=0;//     invoke-direct/range {p0 .. p6}, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;-><init>(Lcom/lidroid/xutils/util/core/LruDiskCache;Ljava/lang/String;J[Ljava/io/FileInputStream;[J)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 779
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;->ins:[Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/io/FileInputStream;);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     if-lt v1, v3, :cond_0
a=0;// 
a=0;//     .line 782
a=0;//     return-void
a=0;// 
a=0;//     .line 779
a=0;//     :cond_0
a=0;//     aget-object v0, v2, v1
a=0;// 
a=0;//     .line 780
a=0;//     .local v0, "in":Ljava/io/InputStream;
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V
a=0;// 
a=0;//     .line 779
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public edit()Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 753
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;->this$0:Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;->diskKey:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-wide v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;->sequenceNumber:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/lidroid/xutils/util/core/LruDiskCache;->access$5(Lcom/lidroid/xutils/util/core/LruDiskCache;Ljava/lang/String;J)Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getInputStream(I)Ljava/io/FileInputStream;
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 760
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;->ins:[Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/io/FileInputStream;);
a=0;//     aget-object v0, v0, p1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getLength(I)J
a=0;//     .locals 2
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 774
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;->lengths:[J
a=0;// 
a=0;//     #v0=(Reference,[J);
a=0;//     aget-wide v0, v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getString(I)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 767
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/util/core/LruDiskCache$Snapshot;->getInputStream(I)Ljava/io/FileInputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v0}, Lcom/lidroid/xutils/util/core/LruDiskCache;->access$6(Ljava/io/InputStream;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
