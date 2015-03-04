package com.twocloo.com.cn.view; class DragGridView$3 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/view/DragGridView$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DragGridView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/view/DragGridView;->onSwapItem(II)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/view/DragGridView;
a=0;// 
a=0;// .field private final synthetic val$observer:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;// .field private final synthetic val$tempPosition:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/view/DragGridView;Landroid/view/ViewTreeObserver;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/DragGridView$3;->this$0:Lcom/twocloo/com/cn/view/DragGridView;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/view/DragGridView$3;->val$observer:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/view/DragGridView$3;->val$tempPosition:I
a=0;// 
a=0;//     .line 469
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/DragGridView$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onPreDraw()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 473
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView$3;->val$observer:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewTreeObserver;);
a=0;//     invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
a=0;// 
a=0;//     .line 474
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView$3;->this$0:Lcom/twocloo/com/cn/view/DragGridView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/DragGridView$3;->this$0:Lcom/twocloo/com/cn/view/DragGridView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/DragGridView;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/DragGridView;->access$0(Lcom/twocloo/com/cn/view/DragGridView;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/twocloo/com/cn/view/DragGridView$3;->val$tempPosition:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloo/com/cn/view/DragGridView;->access$14(Lcom/twocloo/com/cn/view/DragGridView;II)V
a=0;// 
a=0;//     .line 475
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/DragGridView$3;->this$0:Lcom/twocloo/com/cn/view/DragGridView;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloo/com/cn/view/DragGridView$3;->val$tempPosition:I
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/view/DragGridView;->access$15(Lcom/twocloo/com/cn/view/DragGridView;I)V
a=0;// 
a=0;//     .line 476
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
}}
