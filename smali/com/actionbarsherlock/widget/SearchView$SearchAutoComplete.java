package com.actionbarsherlock.widget; class SearchView$SearchAutoComplete { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// .super Landroid/widget/AutoCompleteTextView;
a=0;// .source "SearchView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/widget/SearchView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "SearchAutoComplete"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mSearchView:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;// .field private mThreshold:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1668
a=0;//     invoke-direct {p0, p1}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 1669
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getThreshold()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->mThreshold:I
a=0;// 
a=0;//     .line 1670
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1673
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 1674
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getThreshold()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->mThreshold:I
a=0;// 
a=0;//     .line 1675
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1678
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 1679
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;);
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getThreshold()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->mThreshold:I
a=0;// 
a=0;//     .line 1680
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1695
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private isEmpty()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1696
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/Editable;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public enoughToFilter()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1749
a=0;//     iget v0, p0, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->mThreshold:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->enoughToFilter()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onFocusChanged(ZILandroid/graphics/Rect;)V
a=0;//     .locals 1
a=0;//     .param p1, "focused"    # Z
a=0;//     .param p2, "direction"    # I
a=0;//     .param p3, "previouslyFocusedRect"    # Landroid/graphics/Rect;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1739
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/widget/AutoCompleteTextView;->onFocusChanged(ZILandroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 1740
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->mSearchView:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/widget/SearchView;->onTextFocusChanged()V
a=0;// 
a=0;//     .line 1741
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 4
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1754
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne p1, v2, :cond_3
a=0;// 
a=0;//     .line 1757
a=0;//     invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 1758
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1759
a=0;//     .local v0, "state":Landroid/view/KeyEvent$DispatcherState;
a=0;//     #v0=(Reference,Landroid/view/KeyEvent$DispatcherState;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1760
a=0;//     invoke-virtual {v0, p2, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 1775
a=0;//     .end local v0    # "state":Landroid/view/KeyEvent$DispatcherState;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 1763
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(One);v2=(Integer);v3=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ne v2, v1, :cond_3
a=0;// 
a=0;//     .line 1764
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1765
a=0;//     .restart local v0    # "state":Landroid/view/KeyEvent$DispatcherState;
a=0;//     #v0=(Reference,Landroid/view/KeyEvent$DispatcherState;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1766
a=0;//     invoke-virtual {v0, p2}, Landroid/view/KeyEvent$DispatcherState;->handleUpEvent(Landroid/view/KeyEvent;)V
a=0;// 
a=0;//     .line 1768
a=0;//     :cond_2
a=0;//     invoke-virtual {p2}, Landroid/view/KeyEvent;->isTracking()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/KeyEvent;->isCanceled()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 1769
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->mSearchView:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/SearchView;);
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/widget/SearchView;->clearFocus()V
a=0;// 
a=0;//     .line 1770
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->mSearchView:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v2, v3}, Lcom/actionbarsherlock/widget/SearchView;->access$20(Lcom/actionbarsherlock/widget/SearchView;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1775
a=0;//     .end local v0    # "state":Landroid/view/KeyEvent$DispatcherState;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Uninit);
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/AutoCompleteTextView;->onKeyPreIme(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onWindowFocusChanged(Z)V
a=0;//     .locals 3
a=0;//     .param p1, "hasWindowFocus"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1723
a=0;//     invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->onWindowFocusChanged(Z)V
a=0;// 
a=0;//     .line 1725
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->mSearchView:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/widget/SearchView;);
a=0;//     invoke-virtual {v1}, Lcom/actionbarsherlock/widget/SearchView;->hasFocus()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1726
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1727
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "input_method"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1726
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/inputmethod/InputMethodManager;
a=0;// 
a=0;//     .line 1728
a=0;//     .local v0, "inputManager":Landroid/view/inputmethod/InputMethodManager;
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z
a=0;// 
a=0;//     .line 1731
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/widget/SearchView;->isLandscapeMode(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1732
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {p0, v1}, Lcom/actionbarsherlock/widget/SearchView;->access$19(Landroid/widget/AutoCompleteTextView;Z)V
a=0;// 
a=0;//     .line 1735
a=0;//     .end local v0    # "inputManager":Landroid/view/inputmethod/InputMethodManager;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public performCompletion()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1715
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected replaceText(Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;//     .param p1, "text"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1705
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setSearchView(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;//     .locals 0
a=0;//     .param p1, "searchView"    # Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1683
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->mSearchView:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     .line 1684
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setThreshold(I)V
a=0;//     .locals 0
a=0;//     .param p1, "threshold"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1688
a=0;//     invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setThreshold(I)V
a=0;// 
a=0;//     .line 1689
a=0;//     iput p1, p0, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->mThreshold:I
a=0;// 
a=0;//     .line 1690
a=0;//     return-void
a=0;// .end method
}}
