package com.lidroid.xutils.util.core; class LruDiskCache$Editor$FaultHidingOutputStream { void a() { int a;
a=0;// .class Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;
a=0;// .super Ljava/io/FilterOutputStream;
a=0;// .source "LruDiskCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "FaultHidingOutputStream"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;Ljava/io/OutputStream;)V
a=0;//     .locals 0
a=0;//     .param p2, "out"    # Ljava/io/OutputStream;
a=0;// 
a=0;//     .prologue
a=0;//     .line 917
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;->this$1:Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     .line 918
a=0;//     invoke-direct {p0, p2}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 919
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;Ljava/io/OutputStream;Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 917
a=0;//     invoke-direct {p0, p1, p2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;-><init>(Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 943
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 947
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 944
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 945
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;->this$1:Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v1, v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;->access$0(Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public flush()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 952
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 956
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 953
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 954
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;->this$1:Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v1, v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;->access$0(Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public write(I)V
a=0;//     .locals 3
a=0;//     .param p1, "oneByte"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 924
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 928
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 925
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 926
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;->this$1:Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v1, v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;->access$0(Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public write([BII)V
a=0;//     .locals 3
a=0;//     .param p1, "buffer"    # [B
a=0;//     .param p2, "offset"    # I
a=0;//     .param p3, "length"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 933
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v1, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 934
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;->out:Ljava/io/OutputStream;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 938
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 935
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 936
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor$FaultHidingOutputStream;->this$1:Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v1, v2}, Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;->access$0(Lcom/lidroid/xutils/util/core/LruDiskCache$Editor;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
