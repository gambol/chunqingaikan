package com.actionbarsherlock.internal.view; class StandaloneActionMode { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/view/StandaloneActionMode;
a=0;// .super Lcom/actionbarsherlock/view/ActionMode;
a=0;// .source "StandaloneActionMode.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/internal/view/menu/MenuBuilder$Callback;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;// .field private mCustomView:Ljava/lang/ref/WeakReference;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ref/WeakReference",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mFinished:Z
a=0;// 
a=0;// .field private mFocusable:Z
a=0;// 
a=0;// .field private mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/widget/ActionBarContextView;Lcom/actionbarsherlock/view/ActionMode$Callback;Z)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "view"    # Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;//     .param p3, "callback"    # Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;//     .param p4, "isFocusable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/view/ActionMode;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/StandaloneActionMode;);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 46
a=0;//     iput-object p2, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     .line 47
a=0;//     iput-object p3, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     .line 49
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     invoke-direct {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->setDefaultShowAsAction(I)Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;->setCallback(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder$Callback;)V
a=0;// 
a=0;//     .line 51
a=0;//     iput-boolean p4, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mFocusable:Z
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public finish()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mFinished:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mFinished:Z
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     const/16 v1, 0x20
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Lcom/actionbarsherlock/view/ActionMode$Callback;->onDestroyActionMode(Lcom/actionbarsherlock/view/ActionMode;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCustomView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mCustomView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mCustomView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getMenu()Lcom/actionbarsherlock/view/Menu;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMenuInflater()Lcom/actionbarsherlock/view/MenuInflater;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     new-instance v0, Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcom/actionbarsherlock/view/MenuInflater;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSubtitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public invalidate()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionMode$Callback;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;);
a=0;//     invoke-interface {v0, p0, v1}, Lcom/actionbarsherlock/view/ActionMode$Callback;->onPrepareActionMode(Lcom/actionbarsherlock/view/ActionMode;Lcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     .line 83
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isUiFocusable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mFocusable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onCloseMenu(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Z)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "allMenusAreClosing"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCloseSubMenu(Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemSelected(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "item"    # Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionMode$Callback;);
a=0;//     invoke-interface {v0, p0, p2}, Lcom/actionbarsherlock/view/ActionMode$Callback;->onActionItemClicked(Lcom/actionbarsherlock/view/ActionMode;Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onMenuModeChange(Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->invalidate()V
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->showOverflowMenu()Z
a=0;// 
a=0;//     .line 143
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSubMenuSelected(Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;)Z
a=0;//     .locals 3
a=0;//     .param p1, "subMenu"    # Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 129
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/SubMenuBuilder;->hasVisibleItems()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 133
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/MenuBuilder;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/MenuPopupHelper;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setCustomView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 77
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mCustomView:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setSubtitle(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->setSubtitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSubtitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "subtitle"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/StandaloneActionMode;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 57
a=0;//     return-void
a=0;// .end method
}}