package com.actionbarsherlock.internal.view.menu; class ActionMenuPresenter$OverflowMenuButton { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;
a=0;// .super Landroid/widget/ImageButton;
a=0;// .source "ActionMenuPresenter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/internal/view/View_HasStateListenerSupport;
a=0;// .implements Lcom/actionbarsherlock/internal/view/menu/ActionMenuView$ActionMenuChildView;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "OverflowMenuButton"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mListeners:Ljava/util/Set;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Set",
a=0;//             "<",
a=0;//             "Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;Landroid/content/Context;)V
a=0;//     .locals 3
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 573
a=0;//     #v2=(One);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->this$0:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     .line 574
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sget v1, Lcom/actionbarsherlock/R$attr;->actionOverflowButtonStyle:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p2, v0, v1}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 571
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;);
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->mListeners:Ljava/util/Set;
a=0;// 
a=0;//     .line 576
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->setClickable(Z)V
a=0;// 
a=0;//     .line 577
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->setFocusable(Z)V
a=0;// 
a=0;//     .line 578
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->setVisibility(I)V
a=0;// 
a=0;//     .line 579
a=0;//     invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->setEnabled(Z)V
a=0;// 
a=0;//     .line 580
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addOnAttachStateChangeListener(Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 621
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->mListeners:Ljava/util/Set;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 622
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public needsDividerAfter()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 598
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public needsDividerBefore()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 594
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 603
a=0;//     invoke-super {p0}, Landroid/widget/ImageButton;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 604
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->mListeners:Ljava/util/Set;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
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
a=0;//     .line 607
a=0;//     return-void
a=0;// 
a=0;//     .line 604
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;
a=0;// 
a=0;//     .line 605
a=0;//     .local v0, "listener":Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;
a=0;//     invoke-interface {v0, p0}, Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;->onViewAttachedToWindow(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 611
a=0;//     invoke-super {p0}, Landroid/widget/ImageButton;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 612
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->mListeners:Ljava/util/Set;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
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
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 616
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->this$0:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->access$0(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;)Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->this$0:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->access$0(Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;)Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowPopup;->dismiss()V
a=0;// 
a=0;//     .line 617
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 612
a=0;//     :cond_1
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;
a=0;// 
a=0;//     .line 613
a=0;//     .local v0, "listener":Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;
a=0;//     invoke-interface {v0, p0}, Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;->onViewDetachedFromWindow(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public performClick()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 584
a=0;//     #v1=(One);
a=0;//     invoke-super {p0}, Landroid/widget/ImageButton;->performClick()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 590
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 588
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->playSoundEffect(I)V
a=0;// 
a=0;//     .line 589
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->this$0:Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter;->showOverflowMenu()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public removeOnAttachStateChangeListener(Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Lcom/actionbarsherlock/internal/view/View_OnAttachStateChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 626
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->mListeners:Ljava/util/Set;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 627
a=0;//     return-void
a=0;// .end method
}}
