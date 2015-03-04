package com.handmark.pulltorefresh.library; class PullToRefreshListView$InternalListView { void a() { int a;
a=0;// .class public Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;
a=0;// .super Landroid/widget/ListView;
a=0;// .source "PullToRefreshListView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/handmark/pulltorefresh/library/internal/EmptyViewMethodAccessor;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x4
a=0;//     name = "InternalListView"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAddedLvFooter:Z
a=0;// 
a=0;// .field final synthetic this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/handmark/pulltorefresh/library/PullToRefreshListView;Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;//     .param p3, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 281
a=0;//     iput-object p1, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     .line 282
a=0;//     invoke-direct {p0, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 279
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;->mAddedLvFooter:Z
a=0;// 
a=0;//     .line 283
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected dispatchDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 1
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 293
a=0;//     :try_start_0
a=0;//     invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchDraw(Landroid/graphics/Canvas;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 297
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 294
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 295
a=0;//     .local v0, "e":Ljava/lang/IndexOutOfBoundsException;
a=0;//     #v0=(Reference,Ljava/lang/IndexOutOfBoundsException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/IndexOutOfBoundsException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 307
a=0;//     :try_start_0
a=0;//     invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 310
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 308
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 309
a=0;//     .local v0, "e":Ljava/lang/IndexOutOfBoundsException;
a=0;//     #v0=(Reference,Ljava/lang/IndexOutOfBoundsException;);
a=0;//     invoke-virtual {v0}, Ljava/lang/IndexOutOfBoundsException;->printStackTrace()V
a=0;// 
a=0;//     .line 310
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/ListAdapter;)V
a=0;//     .locals 3
a=0;//     .param p1, "adapter"    # Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 317
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshListView;);
a=0;//     invoke-static {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->access$1(Lcom/handmark/pulltorefresh/library/PullToRefreshListView;)Landroid/widget/FrameLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;->mAddedLvFooter:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 318
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshListView;);
a=0;//     invoke-static {v0}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->access$1(Lcom/handmark/pulltorefresh/library/PullToRefreshListView;)Landroid/widget/FrameLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V
a=0;// 
a=0;//     .line 319
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;->mAddedLvFooter:Z
a=0;// 
a=0;//     .line 322
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 323
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setEmptyView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "emptyView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 327
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/PullToRefreshListView$InternalListView;->this$0:Lcom/handmark/pulltorefresh/library/PullToRefreshListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/handmark/pulltorefresh/library/PullToRefreshListView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/handmark/pulltorefresh/library/PullToRefreshListView;->setEmptyView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 328
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setEmptyViewInternal(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "emptyView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 332
a=0;//     invoke-super {p0, p1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 333
a=0;//     return-void
a=0;// .end method
}}
