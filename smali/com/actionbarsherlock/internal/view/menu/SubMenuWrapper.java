package com.actionbarsherlock.internal.view.menu; class SubMenuWrapper { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;
a=0;// .super Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;// .source "SubMenuWrapper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mItem:Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;// .field private final mNativeSubMenu:Landroid/view/SubMenu;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/view/SubMenu;)V
a=0;//     .locals 1
a=0;//     .param p1, "nativeSubMenu"    # Landroid/view/SubMenu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;-><init>(Landroid/view/Menu;)V
a=0;// 
a=0;//     .line 10
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;->mItem:Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .line 14
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;->mNativeSubMenu:Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 15
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clearHeader()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;->mNativeSubMenu:Landroid/view/SubMenu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/SubMenu;);
a=0;//     invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getItem()Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;->mItem:Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;->mNativeSubMenu:Landroid/view/SubMenu;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/SubMenu;);
a=0;//     invoke-interface {v1}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;-><init>(Landroid/view/MenuItem;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;->mItem:Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;->mItem:Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setHeaderIcon(I)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "iconRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;->mNativeSubMenu:Landroid/view/SubMenu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/SubMenu;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderIcon(I)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 33
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setHeaderIcon(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;->mNativeSubMenu:Landroid/view/SubMenu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/SubMenu;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 39
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setHeaderTitle(I)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "titleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;->mNativeSubMenu:Landroid/view/SubMenu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/SubMenu;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderTitle(I)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 21
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setHeaderTitle(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;->mNativeSubMenu:Landroid/view/SubMenu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/SubMenu;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 27
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setHeaderView(Landroid/view/View;)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;->mNativeSubMenu:Landroid/view/SubMenu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/SubMenu;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 45
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(I)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "iconRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;->mNativeSubMenu:Landroid/view/SubMenu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/SubMenu;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/SubMenu;->setIcon(I)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 56
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;->mNativeSubMenu:Landroid/view/SubMenu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/SubMenu;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/SubMenu;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 62
a=0;//     return-object p0
a=0;// .end method
}}
