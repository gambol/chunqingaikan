package com.twocloo.com.cn.adapters; class BookMarkAdapter$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BookMarkAdapter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// 
a=0;// .field private final synthetic val$bm:Lcom/twocloo/com/cn/beans/BookMark;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;Lcom/twocloo/com/cn/beans/BookMark;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;->this$0:Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;->val$bm:Lcom/twocloo/com/cn/beans/BookMark;
a=0;// 
a=0;//     .line 102
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;->this$0:Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/BookMarkAdapter;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;->this$0:Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/adapters/BookMarkAdapter;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->access$0(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->access$2(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;Lcom/twocloo/com/cn/db/DBAdapter;)V
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;->this$0:Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->access$3(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;->this$0:Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->access$3(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;->val$bm:Lcom/twocloo/com/cn/beans/BookMark;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/BookMark;->getId()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/twocloo/com/cn/db/DBAdapter;->deleteOneMark(J)J
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;->this$0:Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->access$3(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/adapters/BookMarkAdapter$2;->this$0:Lcom/twocloo/com/cn/adapters/BookMarkAdapter;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/adapters/BookMarkAdapter;->access$4(Lcom/twocloo/com/cn/adapters/BookMarkAdapter;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 110
a=0;//     return-void
a=0;// .end method
}}
