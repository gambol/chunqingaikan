package com.actionbarsherlock.view; class MenuInflater { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/view/MenuInflater;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MenuInflater.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/actionbarsherlock/view/MenuInflater$InflatedOnMenuItemClickListener;,
a=0;//         Lcom/actionbarsherlock/view/MenuInflater$MenuState;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static final ACTION_VIEW_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static final LOG_TAG:Ljava/lang/String; = "MenuInflater"
a=0;// 
a=0;// .field private static final NO_ID:I = 0x0
a=0;// 
a=0;// .field private static final XML_GROUP:Ljava/lang/String; = "group"
a=0;// 
a=0;// .field private static final XML_ITEM:Ljava/lang/String; = "item"
a=0;// 
a=0;// .field private static final XML_MENU:Ljava/lang/String; = "menu"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mActionProviderConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;// .field private final mActionViewConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mRealOwner:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-class v2, Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcom/actionbarsherlock/view/MenuInflater;->ACTION_VIEW_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;
a=0;// 
a=0;//     .line 63
a=0;//     sget-object v0, Lcom/actionbarsherlock/view/MenuInflater;->ACTION_VIEW_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;
a=0;// 
a=0;//     sput-object v0, Lcom/actionbarsherlock/view/MenuInflater;->ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 78
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/view/MenuInflater;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 79
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/view/MenuInflater;->mRealOwner:Ljava/lang/Object;
a=0;// 
a=0;//     .line 80
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aput-object p1, v0, v1
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/view/MenuInflater;->mActionViewConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/view/MenuInflater;->mActionViewConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/view/MenuInflater;->mActionProviderConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 82
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "realOwner"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 91
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/view/MenuInflater;);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/view/MenuInflater;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 92
a=0;//     iput-object p2, p0, Lcom/actionbarsherlock/view/MenuInflater;->mRealOwner:Ljava/lang/Object;
a=0;// 
a=0;//     .line 93
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aput-object p1, v0, v1
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/view/MenuInflater;->mActionViewConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/view/MenuInflater;->mActionViewConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/view/MenuInflater;->mActionProviderConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 95
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/actionbarsherlock/view/MenuInflater;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/view/MenuInflater;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1()[Ljava/lang/Class;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     sget-object v0, Lcom/actionbarsherlock/view/MenuInflater;->ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/actionbarsherlock/view/MenuInflater;)[Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/view/MenuInflater;->mActionProviderConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/actionbarsherlock/view/MenuInflater;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/view/MenuInflater;->mRealOwner:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4()[Ljava/lang/Class;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     sget-object v0, Lcom/actionbarsherlock/view/MenuInflater;->ACTION_VIEW_CONSTRUCTOR_SIGNATURE:[Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/actionbarsherlock/view/MenuInflater;)[Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/view/MenuInflater;->mActionViewConstructorArguments:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private parseMenu(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Lcom/actionbarsherlock/view/Menu;)V
a=0;//     .locals 10
a=0;//     .param p1, "parser"    # Lorg/xmlpull/v1/XmlPullParser;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "menu"    # Lcom/actionbarsherlock/view/Menu;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/xmlpull/v1/XmlPullParserException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     new-instance v2, Lcom/actionbarsherlock/view/MenuInflater$MenuState;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/view/MenuInflater$MenuState;);
a=0;//     invoke-direct {v2, p0, p3}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;-><init>(Lcom/actionbarsherlock/view/MenuInflater;Lcom/actionbarsherlock/view/Menu;)V
a=0;// 
a=0;//     .line 130
a=0;//     .local v2, "menuState":Lcom/actionbarsherlock/view/MenuInflater$MenuState;
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/view/MenuInflater$MenuState;);
a=0;//     invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 132
a=0;//     .local v0, "eventType":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 133
a=0;//     .local v1, "lookingForEndOfUnknownTag":Z
a=0;//     #v1=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 137
a=0;//     .local v6, "unknownTagName":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v6=(Null);v7=(Conflicted);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v0, v7, :cond_2
a=0;// 
a=0;//     .line 138
a=0;//     invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 139
a=0;//     .local v5, "tagName":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "menu"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 141
a=0;//     invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 150
a=0;//     .end local v5    # "tagName":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 151
a=0;//     .local v3, "reachedEndOfMenu":Z
a=0;//     :goto_1
a=0;//     #v1=(Boolean);v3=(Boolean);v4=(Conflicted);v6=(Reference,Ljava/lang/String;);v7=(Conflicted);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 204
a=0;//     return-void
a=0;// 
a=0;//     .line 145
a=0;//     .end local v3    # "reachedEndOfMenu":Z
a=0;//     .restart local v5    # "tagName":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v1=(Null);v3=(Uninit);v4=(Uninit);v5=(Reference,Ljava/lang/String;);v6=(Null);v7=(Boolean);
a=0;//     new-instance v7, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Expecting menu, got "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 147
a=0;//     .end local v5    # "tagName":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v5=(Uninit);v7=(PosByte);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 148
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     if-ne v0, v7, :cond_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 152
a=0;//     .restart local v3    # "reachedEndOfMenu":Z
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/lang/String;);v7=(Conflicted);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 202
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 154
a=0;//     :pswitch_0
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 158
a=0;//     invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 159
a=0;//     .restart local v5    # "tagName":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "group"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 160
a=0;//     invoke-virtual {v2, p2}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->readGroup(Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 161
a=0;//     :cond_5
a=0;//     const-string v7, "item"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     .line 162
a=0;//     invoke-virtual {v2, p2}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->readItem(Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 163
a=0;//     :cond_6
a=0;//     const-string v7, "menu"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_7
a=0;// 
a=0;//     .line 165
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->addSubMenuItem()Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 168
a=0;//     .local v4, "subMenu":Lcom/actionbarsherlock/view/SubMenu;
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/view/SubMenu;);
a=0;//     invoke-direct {p0, p1, p2, v4}, Lcom/actionbarsherlock/view/MenuInflater;->parseMenu(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Lcom/actionbarsherlock/view/Menu;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 170
a=0;//     .end local v4    # "subMenu":Lcom/actionbarsherlock/view/SubMenu;
a=0;//     :cond_7
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 171
a=0;//     #v1=(One);
a=0;//     move-object v6, v5
a=0;// 
a=0;//     .line 173
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 176
a=0;//     .end local v5    # "tagName":Ljava/lang/String;
a=0;//     :pswitch_1
a=0;//     #v1=(Boolean);v5=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 177
a=0;//     .restart local v5    # "tagName":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     .line 178
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 179
a=0;//     #v1=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 180
a=0;//     #v6=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Boolean);v6=(Reference,Ljava/lang/String;);v7=(Conflicted);
a=0;//     const-string v7, "group"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_9
a=0;// 
a=0;//     .line 181
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->resetGroup()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 182
a=0;//     :cond_9
a=0;//     const-string v7, "item"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_b
a=0;// 
a=0;//     .line 185
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->hasAddedItem()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 186
a=0;//     invoke-static {v2}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->access$0(Lcom/actionbarsherlock/view/MenuInflater$MenuState;)Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/actionbarsherlock/view/ActionProvider;);
a=0;//     if-eqz v7, :cond_a
a=0;// 
a=0;//     .line 187
a=0;//     invoke-static {v2}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->access$0(Lcom/actionbarsherlock/view/MenuInflater$MenuState;)Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/actionbarsherlock/view/ActionProvider;->hasSubMenu()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_a
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->addSubMenuItem()Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 190
a=0;//     :cond_a
a=0;//     #v7=(Conflicted);
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/view/MenuInflater$MenuState;->addItem()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 193
a=0;//     :cond_b
a=0;//     #v7=(Boolean);
a=0;//     const-string v7, "menu"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     .line 194
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 196
a=0;//     #v3=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 199
a=0;//     .end local v5    # "tagName":Ljava/lang/String;
a=0;//     :pswitch_2
a=0;//     #v3=(Boolean);v5=(Conflicted);v7=(Conflicted);
a=0;//     new-instance v7, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v8, "Unexpected end of document"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 152
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public inflate(ILcom/actionbarsherlock/view/Menu;)V
a=0;//     .locals 5
a=0;//     .param p1, "menuRes"    # I
a=0;//     .param p2, "menu"    # Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 109
a=0;//     .local v2, "parser":Landroid/content/res/XmlResourceParser;
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/view/MenuInflater;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 110
a=0;//     #v2=(Reference,Landroid/content/res/XmlResourceParser;);
a=0;//     invoke-static {v2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 112
a=0;//     .local v0, "attrs":Landroid/util/AttributeSet;
a=0;//     #v0=(Reference,Landroid/util/AttributeSet;);
a=0;//     invoke-direct {p0, v2, v0, p2}, Lcom/actionbarsherlock/view/MenuInflater;->parseMenu(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Lcom/actionbarsherlock/view/Menu;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 118
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->close()V
a=0;// 
a=0;//     .line 120
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 113
a=0;//     .end local v0    # "attrs":Landroid/util/AttributeSet;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 114
a=0;//     .local v1, "e":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Lorg/xmlpull/v1/XmlPullParserException;);
a=0;//     new-instance v3, Landroid/view/InflateException;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/InflateException;);
a=0;//     const-string v4, "Error inflating menu XML"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/InflateException;);
a=0;//     throw v3
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 117
a=0;//     .end local v1    # "e":Lorg/xmlpull/v1/XmlPullParserException;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 118
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/res/XmlResourceParser;->close()V
a=0;// 
a=0;//     .line 119
a=0;//     :cond_1
a=0;//     throw v3
a=0;// 
a=0;//     .line 115
a=0;//     :catch_1
a=0;//     #v1=(Uninit);v3=(Conflicted);v4=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 116
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     :try_start_2
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     new-instance v3, Landroid/view/InflateException;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/InflateException;);
a=0;//     const-string v4, "Error inflating menu XML"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/InflateException;);
a=0;//     throw v3
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// .end method
}}
