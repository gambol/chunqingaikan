package com.handmark.pulltorefresh.library; class LoadingLayoutProxy { void a() { int a;
a=0;// .class public Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LoadingLayoutProxy.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/handmark/pulltorefresh/library/ILoadingLayout;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mLoadingLayouts:Ljava/util/HashSet;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashSet",
a=0;//             "<",
a=0;//             "Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;);
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     iput-object v0, p0, Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;->mLoadingLayouts:Ljava/util/HashSet;
a=0;// 
a=0;//     .line 16
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addLayout(Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;)V
a=0;//     .locals 1
a=0;//     .param p1, "layout"    # Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;->mLoadingLayouts:Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLastUpdatedLabel(Ljava/lang/CharSequence;)V
a=0;//     .locals 3
a=0;//     .param p1, "label"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;->mLoadingLayouts:Ljava/util/HashSet;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 35
a=0;//     .local v0, "layout":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     invoke-virtual {v0, p1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setLastUpdatedLabel(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setLoadingDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 3
a=0;//     .param p1, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;->mLoadingLayouts:Ljava/util/HashSet;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 41
a=0;//     .local v0, "layout":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     invoke-virtual {v0, p1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setLoadingDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setPullLabel(Ljava/lang/CharSequence;)V
a=0;//     .locals 3
a=0;//     .param p1, "label"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;->mLoadingLayouts:Ljava/util/HashSet;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 54
a=0;//     .local v0, "layout":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     invoke-virtual {v0, p1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setPullLabel(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setRefreshingLabel(Ljava/lang/CharSequence;)V
a=0;//     .locals 3
a=0;//     .param p1, "refreshingLabel"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;->mLoadingLayouts:Ljava/util/HashSet;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 48
a=0;//     .local v0, "layout":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     invoke-virtual {v0, p1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setRefreshingLabel(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setReleaseLabel(Ljava/lang/CharSequence;)V
a=0;//     .locals 3
a=0;//     .param p1, "label"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;->mLoadingLayouts:Ljava/util/HashSet;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// 
a=0;//     .line 60
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 61
a=0;//     .local v0, "layout":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     invoke-virtual {v0, p1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setReleaseLabel(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setTextTypeface(Landroid/graphics/Typeface;)V
a=0;//     .locals 3
a=0;//     .param p1, "tf"    # Landroid/graphics/Typeface;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v1, p0, Lcom/handmark/pulltorefresh/library/LoadingLayoutProxy;->mLoadingLayouts:Ljava/util/HashSet;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// 
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "layout":Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;
a=0;//     invoke-virtual {v0, p1}, Lcom/handmark/pulltorefresh/library/internal/LoadingLayout;->setTextTypeface(Landroid/graphics/Typeface;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
