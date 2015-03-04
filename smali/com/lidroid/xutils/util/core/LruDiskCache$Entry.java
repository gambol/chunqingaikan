package com.lidroid.xutils.util.core; class LruDiskCache$Entry { void a() { int a;
a=0;// .class final Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LruDiskCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x12
a=0;//     name = "Entry"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private currentEditor:Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;// .field private final diskKey:Ljava/lang/String;
a=0;// 
a=0;// .field private expiryTimestamp:J
a=0;// 
a=0;// .field private final lengths:[J
a=0;// 
a=0;// .field private readable:Z
a=0;// 
a=0;// .field private sequenceNumber:J
a=0;// 
a=0;// .field final synthetic this$0:Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/lidroid/xutils/util/core/LruDiskCache;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p2, "diskKey"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 985
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->this$0:Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 963
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;);
a=0;//     const-wide v0, 0x7fffffffffffffffL
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->expiryTimestamp:J
a=0;// 
a=0;//     .line 986
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->diskKey:Ljava/lang/String;
a=0;// 
a=0;//     .line 987
a=0;//     invoke-static {p1}, Lcom/lidroid/xutils/util/core/LruDiskCache;->access$7(Lcom/lidroid/xutils/util/core/LruDiskCache;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [J
a=0;// 
a=0;//     #v0=(Reference,[J);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->lengths:[J
a=0;// 
a=0;//     .line 988
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/lidroid/xutils/util/core/LruDiskCache;Ljava/lang/String;Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 985
a=0;//     invoke-direct {p0, p1, p2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;-><init>(Lcom/lidroid/xutils/util/core/LruDiskCache;Ljava/lang/String;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 973
a=0;//     iget-boolean v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->readable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 963
a=0;//     iput-wide p1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->expiryTimestamp:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 983
a=0;//     iget-wide v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->sequenceNumber:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;J)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 983
a=0;//     iput-wide p1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->sequenceNumber:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 978
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->currentEditor:Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 961
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->diskKey:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 973
a=0;//     iput-boolean p1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->readable:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 978
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->currentEditor:Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;[Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1001
a=0;//     invoke-direct {p0, p1, p2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->setLengths([Ljava/lang/String;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)[J
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 968
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->lengths:[J
a=0;// 
a=0;//     #v0=(Reference,[J);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 963
a=0;//     iget-wide v0, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->expiryTimestamp:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method private invalidLengths([Ljava/lang/String;)Ljava/io/IOException;
a=0;//     .locals 3
a=0;//     .param p1, "strings"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1016
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "unexpected journal line: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
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
a=0;// .end method
a=0;// 
a=0;// .method private setLengths([Ljava/lang/String;I)V
a=0;//     .locals 5
a=0;//     .param p1, "strings"    # [Ljava/lang/String;
a=0;//     .param p2, "startIndex"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1002
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v2, p2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->this$0:Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// 
a=0;//     #v3=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache;);
a=0;//     invoke-static {v3}, Lcom/lidroid/xutils/util/core/LruDiskCache;->access$7(Lcom/lidroid/xutils/util/core/LruDiskCache;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v2, v3, :cond_0
a=0;// 
a=0;//     .line 1003
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->invalidLengths([Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 1007
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->this$0:Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// 
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache;);
a=0;//     invoke-static {v2}, Lcom/lidroid/xutils/util/core/LruDiskCache;->access$7(Lcom/lidroid/xutils/util/core/LruDiskCache;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 1013
a=0;//     return-void
a=0;// 
a=0;//     .line 1008
a=0;//     :cond_1
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->lengths:[J
a=0;// 
a=0;//     #v2=(Reference,[J);
a=0;//     add-int v3, v1, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-object v3, p1, v3
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     aput-wide v3, v2, v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1007
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1010
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1011
a=0;//     .local v0, "e":Ljava/lang/NumberFormatException;
a=0;//     #v0=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     invoke-direct {p0, p1}, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->invalidLengths([Ljava/lang/String;)Ljava/io/IOException;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCleanFile(I)Ljava/io/File;
a=0;//     .locals 4
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1020
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->this$0:Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache;);
a=0;//     invoke-static {v1}, Lcom/lidroid/xutils/util/core/LruDiskCache;->access$8(Lcom/lidroid/xutils/util/core/LruDiskCache;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->diskKey:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDirtyFile(I)Ljava/io/File;
a=0;//     .locals 4
a=0;//     .param p1, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1024
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->this$0:Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache;);
a=0;//     invoke-static {v1}, Lcom/lidroid/xutils/util/core/LruDiskCache;->access$8(Lcom/lidroid/xutils/util/core/LruDiskCache;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->diskKey:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ".tmp"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getLengths()Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 991
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 992
a=0;//     .local v0, "result":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Entry;->lengths:[J
a=0;// 
a=0;//     #v4=(Reference,[J);
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Integer);v6=(Conflicted);
a=0;//     if-lt v3, v5, :cond_0
a=0;// 
a=0;//     .line 995
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 992
a=0;//     :cond_0
a=0;//     #v3=(Integer);
a=0;//     aget-wide v1, v4, v3
a=0;// 
a=0;//     .line 993
a=0;//     .local v1, "size":J
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/16 v6, 0x20
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 992
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
