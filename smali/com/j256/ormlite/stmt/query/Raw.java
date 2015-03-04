package com.j256.ormlite.stmt.query; class Raw { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/stmt/query/Raw;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Raw.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/stmt/query/Clause;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final args:[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;// .field private final statement:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;[Lcom/j256/ormlite/stmt/ArgumentHolder;)V
a=0;//     .locals 0
a=0;//     .param p1, "statement"    # Ljava/lang/String;
a=0;//     .param p2, "args"    # [Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 19
a=0;//     #p0=(Reference,Lcom/j256/ormlite/stmt/query/Raw;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/stmt/query/Raw;->statement:Ljava/lang/String;
a=0;// 
a=0;//     .line 20
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/stmt/query/Raw;->args:[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     .line 21
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
a=0;//     .locals 5
a=0;//     .param p1, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p2, "tableName"    # Ljava/lang/String;
a=0;//     .param p3, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/db/DatabaseType;",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/StringBuilder;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/stmt/ArgumentHolder;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     .local p4, "argList":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/stmt/ArgumentHolder;>;"
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/stmt/query/Raw;->statement:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 25
a=0;//     const/16 v4, 0x20
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 26
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/stmt/query/Raw;->args:[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;// 
a=0;//     .local v1, "arr$":[Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;//     #v1=(Reference,[Lcom/j256/ormlite/stmt/ArgumentHolder;);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     aget-object v0, v1, v2
a=0;// 
a=0;//     .line 27
a=0;//     .local v0, "arg":Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;//     #v0=(Null);
a=0;//     invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 26
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 29
a=0;//     .end local v0    # "arg":Lcom/j256/ormlite/stmt/ArgumentHolder;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
